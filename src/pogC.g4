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
    : FLOAT ID ASSIGN floatFormatDeclaration SEMICOLON
    ;

floatFormatDeclaration
    : DIGIT PERIOD DIGIT+
    | PERIOD DIGIT+
    | PERIOD DIGIT+ floatF
    | DIGIT PERIOD DIGIT+ floatF
    ;

floatF
    : F
    ;

stringDeclaration
    : STRING ID ASSIGN TEXT SEMICOLON
    ;

booleanDeclaration
    : BOOL ID ASSIGN TRUE SEMICOLON
    | BOOL ID ASSIGN FALSE SEMICOLON
    ;



fragment
SPACE
    : [ ]
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
F : 'f';
CREATE : 'create';

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
PERIOD : '.';
QUOTMARK : '"';
SINGLEQUOTE : '`';
COMMA : ',';

/*TOKENS??*/
DIGIT : '0' | '-'?[1-9][0-9]*;
ID : '_'?[a-z][a-zA-Z0-9]*;
TEXT : '"' ~'"'* '"' ;

/*STUFF FOR THE CUSTOM FOR LOOP OF THE TEST CASE*/
UP : 'up';
DOWN: 'down';
TO: 'to';

/*SKIPS*/
SLCOMMENT : '//' ~[\t\r\n]* -> skip;
WS : [\r\t\n]+ -> skip;