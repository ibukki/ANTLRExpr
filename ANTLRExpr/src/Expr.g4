grammar Expr;

/**beginning of the rule */
prog:  stat+ ;

stat: ID '=' expr NEWLINE                              # assign
    | 'call' func params NEWLINE                       # readfunc
    | 'print' ID  NEWLINE                              # print
    | NEWLINE                                          # blank  
    ;

func: FNAME                                            # fname
    ;
     
params: '<' param (',' param)* '>'                     # funcparams
    ;

param: INT                                             # int
     | FLOAT                                           # float
     | ID                                              # id
     ; 
     
expr: expr op=('*'|'/') expr                           # MulDiv
    | expr op=('+'|'-') expr                           # AddSub
    | param                                            # funcparam
    | '(' expr ')'                                     # parens
    ;
   
    
MUL :   '*' ; 
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ; 
COMMA : ',' ;
ID : [a-zA-Z]+ ; // match identifiers
INT: [0-9]+;     // match integers
FLOAT: [0-9]+(.[0-9]+)?;
NEWLINE: '\r'?'\n';  // return newlines to parser (is end-statement signal)
FNAME:'func_'[a-zA-Z]+ ; //match functions name
WS: [ \t]+ -> skip ; // toss out whitespace    