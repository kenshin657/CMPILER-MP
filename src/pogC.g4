grammar pogC;

/*KEYWORD DECLARATION*/
INT : 'int';
FLOAT : 'float';
STRING : 'String';
BOOL : 'boolean';
VOID : 'void';

MAIN : 'main';
IF : 'if';
ELSE : 'else';
THEN : 'then';
RETURN : 'return';
WHILE : 'while';
FUNC : 'func';
PRINT : 'print';
SCAN : 'scan';
DO : 'do';
FOR : 'for';

/*OPERATORS*/
ADD : '+';
MULT : '*';
DIV : '/';
SUBT : '-';
MOD : '%';

/*ASSIGNMENT OPERATORS*/
ASSIGN : '=';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MULT_ASSIGN : '*=';
DIV_ASSIGN : '/=';
INCR : '++';
DECR : '--';

/*LOGICAL OPERATORS*/
EQUAL_EQUAL : '==';
GT : '>';
LT : '<';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
LESSEQ : '<=';
GREATEQ : '>=';

/*SPECIAL SYMBOLS*/
LPAREN : '(';
RPAREN : ')';
LBRAK : '[';
RBRAK : ']';
LBRACE : '{';
RBRACE : '}';
SEMICOLON : ';';
PERIOD : ',';

/*TOKENS??*/
DIGIT : '0' | '-'?[1-9][0-9]*;
ID : [a-z][a-zA-Z0-9]*;

/*SKIPS*/
SLCOMMENT : '##' ~[\t\r\n]* -> skip;
WS : [\t\n]+ -> skip;