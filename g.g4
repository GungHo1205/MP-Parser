grammar g;

prule
    : s
    ;

fragment Digit
    :   [0-9]
    ;

fragment Letter
    :   [a-z]
    ;

OP
    :   '+'|'*'|'?'
    ;

U
    :   'U'
    ;

LParen
    :   '('
    ;

RParen
    :   ')'
    ;

E
    : 'E'
    ;

Terminal
    : (Letter|Digit)
    ;


s
    :   i | j
    ;

a
    :   Terminal
    ;

d
    :   h
    ;
i
    :   LParen i RParen OP | i U LParen d RParen OP? | LParen i RParen i? | i U d
        | i U E | E U i | a? LParen a U a RParen| h | a U LParen a U a RParen OP U a? i?
        | E U s
    ;

g
    :   a OP | a
    ;

h
    :   g h i?| g
    ;

j
    : E
    ;
//c
//    : h | h? LParen c RParen OP? c? | LParen c RParen c | c LParen c RParen OP?
//    ;

//e
//    : c | E | e WhiteSpace U WhiteSpace (c | E) | c? LParen e WhiteSpace U WhiteSpace (c | E)RParen OP? c?
//    | e WhiteSpace U WhiteSpace LParen e WhiteSpace U WhiteSpace (c | E)RParen OP?
//    ;
//
//b
//    : a | a b
//    ;
//
//a
//    : Terminal OP?
//    ;
//
//c
//    : b | b? LParen c RParen OP? c? | LParen c RParen c | c LParen c RParen OP?
//    ;
//
//d
//    : c | E | d WhiteSpace U WhiteSpace (c | E) | c? LParen d WhiteSpace U WhiteSpace (c | E)RParen OP? c?
//    | d WhiteSpace U WhiteSpace LParen d WhiteSpace U WhiteSpace (c | E)RParen OP?
//    ;
//
//
//s
//    : d
//    ;
//



//s
//    :   i | j
//    ;
//
//a
//    :   Terminal
//    ;
//
//d
//    :   h
//    ;
//i
//    :   LParen i RParen OP | i WhiteSpace U WhiteSpace LParen d RParen | i WhiteSpace U WhiteSpace LParen d RParen OP
//        | LParen i RParen i? | i WhiteSpace U WhiteSpace d
//        | i WhiteSpace U WhiteSpace E | E WhiteSpace U WhiteSpace i | LParen a WhiteSpace U WhiteSpace a RParen OP? WhiteSpace? U? WhiteSpace? i? WhiteSpace? OP?| h
//        | LParen i RParen OP i? i? a? OP?
//    ;
//
//g
//    :   a OP | a
//    ;
//
//h
//    :   g h | g
//    ;
//
//j
//    : E
//    ;


