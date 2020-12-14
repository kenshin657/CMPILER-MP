grammar pogC;

/*PRODUCTION RULES */

prog
    : mainProg EOF
    ;

mainProg
    : main LPAREN RPAREN LBRACE codeBlock* RBRACE
    ;

main
    : MAIN
    ;

codeBlock
    : (declaration)
    ;

declaration
    : intDeclaration
    | floatDeclaration
    | stringDeclaration
    | booleanDeclaration
    ;

intDeclaration
    : INT ID ASSIGN DIGIT SEMICOLON
    ;

floatDeclaration
    : FLOAT ID ASSIGN DIGIT PERIOD DIGIT SEMICOLON
    ;

stringDeclaration
    : STRING ID ASSIGN QUOTMARK ID QUOTMARK SEMICOLON
    | STRING ID ASSIGN SINGLEQUOTE ID SINGLEQUOTE SEMICOLON
    ;

booleanDeclaration
    : BOOL ID ASSIGN TRUE SEMICOLON
    | BOOL ID ASSIGN FALSE SEMICOLON
    ;








/*KEYWORD DECLARATION*/
INT : 'int';
FLOAT : 'float';
STRING : 'String';
BOOL : 'bool';
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
TRUE : 'T';
FALSE : 'F';

/*SPECIAL SYMBOLS*/
LPAREN : '(';
RPAREN : ')';
LBRAK : '[';
RBRAK : ']';
LBRACE : '{';
RBRACE : '}';
SEMICOLON : ';';
PERIOD : ',';
QUOTMARK : '"';
SINGLEQUOTE : '`';

/*TOKENS??*/
DIGIT : '0' | '-'?[1-9][0-9]*;
ID : [a-z][a-zA-Z0-9]*;

/*STUFF FOR THE CUSTOM FOR LOOP OF THE TEST CASE*/
UP : 'up';
DOWN: 'down';
TO: 'to';

/*SKIPS*/
SLCOMMENT : '//' ~[\t\r\n]* -> skip;
WS : [\t\n]+ -> skip;