#include <stdio.h>

int pof(int i, int j) {

    int n = 1;
    int rep = i;
    for(n = 1; n <= j; n++)
        rep = rep * i;
    return rep;
}
bool gof(char c) {
    if( c != '+' && c != '-' && c != '/' && c != '*' && c != '^' && c != 'p')
        return true;
}
int main() {

   float i, j;
   char str;

   printf("Welcome to the C Infix Calculator!\n");
   printf("What would you like to do?!?\n");
   printf("State an operator...for example-> +, -, /, p, * \n");
   
   
   scanf("%c", &str);
   if(gof(str)){ printf("What numbers are we going to work on!?");
       scanf("%f %f", &i, &j);
   } else {printf("Go 5 yourself!\n"); }
   
   printf("So you want to %c the numbers %.2f and %.2f, ", str, i, j);
   
   if (str =='+')
       printf("and the addition comes to %.2f", i + j );
   else if (str == '/')
       printf("and the division comes to %.2f", i / j );
   else if( str == '*')
       printf("and the multiplication comes to %.2f", i * j);
   else if( str == '-')
       printf("and the sub is %.2f", i - j);
   else if( str == '^')
       printf("and the xor is %d",(int) i ^ (int) j);
   else if( str == 'p')
       printf("and %d to the power %d is %d", (int) i, (int) j, pof((int) i,(int) j)); 

   return 0;
}
