// This the definition of bukki language
// build for simple calulations
// copyright by bubuwork studio

grammar Bukki;

prog: stat+;

block: '{' stat* '}' ;   

stat: block            #codeblock 
    | ID '=' expr ';'  #assign
    | func ';'         #callfunc 
    | ifstat           #ifcond
    | condstat ';'     #cond
    ;
    
ifstat: 'if' expr stat ('else' stat)?
      ;

condstat: expr '?' expr ':' expr 
        ;

func: (ID '=')? fname '(' params ')'
    ;

fname: ID
     ;

params: param (',' param)* 
      ;
      
expr: expr op=('*'|'/') expr                           # muldiv
    | expr op=('+'|'-') expr                           # addsub
    | expr '==' expr                                   # equal
    | expr '>' expr                                    # gt
    | expr '>=' expr                                   # ge 
    | expr '<' expr                                    # lt
    | expr '<=' expr                                   # le
    | '!' expr                                         # not
    | expr op=('&&'|'||') expr                         # andor
    | '(' expr ')'                                     # parens
    | param                                            # funcparam
    ;
    
param: INT                                             # int
     | FLOAT                                           # float
     | BOOLEAN                                         # bool
     | ID                                              # id
     | STRING                                          # string
     ;
     
ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

STRING
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;
    
INT    : '0' | [1-9] [0-9]* ; 		//no leading zeros
FLOAT  : DIGIT+ '.' DIGIT* 			// match 1. 39. 3.14159 etc...
		| '.' DIGIT+ 				// match .1 .14159
	   ;
fragment
DIGIT : [0-9] ; 					// match single digit

BOOLEAN : 'TRUE'
        | 'FALSE'
        ;

MUL :   '*' ; 
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ; 
COMMA : ',' ;
AND : '&&';
OR  : '||';

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix : ('l'|'L') ;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

Identifier
    :   Letter (Letter|JavaIDDigit)*
    ;

/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;
   
WS  :   [ \t\n\r]+ -> skip ;