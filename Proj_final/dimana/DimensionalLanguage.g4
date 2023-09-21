grammar DimensionalLanguage;

program: statement+ EOF;

statement:
    dimensionDef
    | unitDef
    | varDeclaration
    | assignment
    | loop
    | print
    | conditional
    | include;

dimensionDef: 'dimension' ID '=' (DIMENSION | expression) ';';

unitDef: 'unit' ID '=' NUMBER ID ';';

varDeclaration: type ID ('=' expression)? ';';

assignment: ID '=' expression ';';

loop:
    'for' ID '=' expression 'to' expression 'do' statement+ 'end';

print: 'print' expression ';';

conditional:
    'if' boolExpression 'then' statement+ ('else' statement+)? 'end';

include: 'include' STRING_LITERAL ';';

expression:
    expression op = ('*' | '/') expression
    | expression op = ('+' | '-') expression
    | '(' expression ')'
    | ID
    | NUMBER
    | STRING_LITERAL;

boolExpression:
    boolExpression op = ('&' | '|') boolExpression
    | '!' boolExpression
    | '(' boolExpression ')'
    | expression (
        ('<' | '>' | '<=' | '>=' | '==' | '!=') expression
    )?;

type: 'int' | 'real' | 'string' | 'list' | ID;

DIMENSION: [a-zA-Z]+;
COMM: '#' .*? '\n' -> skip ;
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;