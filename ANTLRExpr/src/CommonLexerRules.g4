lexer grammar CommonLexerRules;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ; 
ID : [a-zA-Z]+ ; // match identifiers
INT: [0-9]+;     // match integers
FLOAT: [0-9]+(.[0-9]+)?;
NEWLINE: '\r'?'\n';  // return newlines to parser (is end-statement signal)
WS: [ \t]+ -> skip ; // toss out whitespace