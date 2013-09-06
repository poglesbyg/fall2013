Expr = ID
     | NUM
     | Exp "+" Exp
     | Exp "*" Exp
     | ID '('Exp')'
     | "(" ")"
