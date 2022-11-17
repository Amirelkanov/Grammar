grammar CalcGrammar;

// Grammar rules
statement: assignment EOE | expression EOE;
expression: expression MULT expression #product |
            expression PLUS expression #sum |
            '(' expression ')' #parentheses |
            ID #id |
            INT #int;
assignment: ID EQUALS expression;

// Lexer rules
EOE: ';';
PLUS: '+';
MULT: '*';
EQUALS: '=';

ID: [a-zA-Z]+;
INT: [0-9]+;

