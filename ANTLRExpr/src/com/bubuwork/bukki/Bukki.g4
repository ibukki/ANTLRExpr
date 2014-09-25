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
     ;
     
ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

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

WS  :   [ \t\n\r]+ -> skip ;