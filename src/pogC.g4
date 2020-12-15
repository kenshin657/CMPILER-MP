grammar pogC;

/*PRODUCTION RULES */

prog
    : mainProg EOF
    |functionDeclaration? mainProg EOF
    ;

mainProg
    : main LPAREN RPAREN LBRACE codeBlock? RBRACE
    ;

main
    : MAIN
    ;

functionDeclaration
    : ( funcInit returnExpresion? RBRACE)
    ;

returnExpresion
    : return (opr | ID) SEMICOLON
    ;

return
    : RETURN
    ;

funcInit
    : FUNC dataType ID funcExpression LBRACE codeBlock?
    ;

funcExpression
    : LPAREN funcArgs RPAREN
    ;

funcArgs
    : funcArgs arg
    | arg
    ;

arg
    : arg ','
    | dataType ID
    ;

codeBlock
    : (declaration | scan | print | for | operation)*
    ;

scan
    : SCAN LPAREN TEXT COMMA ID RPAREN SEMICOLON
    ;

print
    : PRINT LPAREN TEXT (ADD ID)? RPAREN SEMICOLON
    ;

for
    : FOR intDeclaration UPTO ID LBRACE codeBlock? RBRACE
    ;

operation
    : ID ASSIGN opr SEMICOLON
    | ID shortCutOpr SEMICOLON
    ;

opr
    : opr POW opr
    | opr (MULT | DIV) opr
    | opr (ADD | SUBT) opr
    | LPAREN opr RPAREN
    | DIGIT
    | ID
    ;

shortCutOpr
    : INCR
    | DECR
    ;

declaration
    : normalDeclaration
    | arrayDeclaration
    ;

normalDeclaration
    : intDeclaration SEMICOLON
    | floatDeclaration SEMICOLON
    | stringDeclaration SEMICOLON
    | booleanDeclaration SEMICOLON
    ;

dataType
    : INT
    | FLOAT
    | STRING
    | VOID
    | BOOL
    ;

intDeclaration
    : INT ID intFormatDeclaration
    ;

floatDeclaration
    : FLOAT ID ASSIGN floatFormatDeclaration
    ;

floatF
    : F
    ;

stringDeclaration
    : STRING ID stringFormatDeclaration
    ;

booleanDeclaration
    : BOOL ID boolFormatDeclaration
    | BOOL ID boolFormatDeclaration
    ;

intFormatDeclaration
    : ASSIGN DIGIT
    ;

floatFormatDeclaration
    : DIGIT PERIOD DIGIT+
    | PERIOD DIGIT+
    | PERIOD DIGIT+ floatF
    | DIGIT PERIOD DIGIT+ floatF
    ;

boolFormatDeclaration
    : ASSIGN TRUE
    | ASSIGN FALSE
    ;

stringFormatDeclaration
    : ASSIGN TEXT
    ;

arrayDeclaration
    : intArrDeclaration
    | floatArrDeclaration
    | stringArrDeclaration
    | boolArrDeclaration
    ;

intArrDeclaration
    : INT LBRAK RBRAK ID ASSIGN CREATE INT LBRAK DIGIT RBRAK SEMICOLON
    ;

floatArrDeclaration
    : FLOAT LBRAK RBRAK ID ASSIGN CREATE FLOAT LBRAK DIGIT RBRAK SEMICOLON
    ;

stringArrDeclaration
    : STRING LBRAK RBRAK ID ASSIGN CREATE STRING LBRAK DIGIT RBRAK SEMICOLON
    ;

boolArrDeclaration
    : BOOL LBRAK RBRAK ID ASSIGN CREATE BOOL LBRAK DIGIT RBRAK SEMICOLON
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
POW :'^';

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
UPTO : 'up to';
TO: 'to';

/*SKIPS*/
SLCOMMENT : '//' ~[\t\r\n]* -> skip;
WS : [\r\t\n]+ -> skip;