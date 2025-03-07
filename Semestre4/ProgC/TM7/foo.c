#include <stdlib.h>

int main() {                                          
    char * c[4] = {"ENTER","NEW","POINT","FIRST"};
    char ** cp[4] = { c+3, c+2, c+1, c};
    char *** cpp = cp;
   
    printf("%s\n",**++cpp);
    printf("%s\n ",*--*++cpp+3);
    printf("%s\n",*cpp[-2]+3);
    printf("%s\n",cpp[-1][-1]+1);
  }