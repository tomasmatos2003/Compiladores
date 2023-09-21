grammar CalComplex;

programm: stat* EOF;

stat:
    output
    | assign
    ;

output: 'output' exp ';';

assign: exp '=>' ID ';';

exp:
    exp op=('+'|'-') exp  #ExpSubSum
    | exp op=('*'|':') exp #ExpMultDiv
    | '(' exp ')'     #ExpParent
    | ID              #ExpId
    | complex       #ExpComplex
    ;

complex: (Number)? (op=('+'|'-'))? (Number? 'i')?;

ID: [a-zA-Z][a-z_A-Z0-9]*;
Number: [0-9]+;
WS: [ \t\n] -> skip;
COMMENT: '##' .*? '\n' -> skip;