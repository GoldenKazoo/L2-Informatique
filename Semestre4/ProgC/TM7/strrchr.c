#include <stdio.h>
#include <stdlib.h>

// char *strrchr(const char *s, int c);
// {
//     while (str[i])
//     {
//         if (str[i] == c)
//             return str
//         str++;
//     }
//     return (NULL);
// }

int main() {                                          
  char * c[4] = {"ENTER","NEW","POINT","FIRST"};
  char ** cp[4] = { c+3, c+2, c+1, c};
  char *** cpp = cp;
 
//   printf("%s\n",**++cpp);
  printf("%s\n ",*--*++cpp+3);
//   printf("%s\n",*cpp[-2]+3);
//   printf("%s\n",cpp[-1][-1]+1);
//   return EXIT_SUCCESS;
}

// int main()
// {
//     char *str1;
//     char *str2;
//     char *str3;
//     char *str4;

//     str1 = "ENTER";
//     str2 = "NEW";
//     str3 = "POINT";
//     str4 = "FIRST";

//     char **c;

//     c = malloc (sizeof(char *) * 4);
//     c[0] = str1;
//     c[1] = str2;
//     c[2] = str3;
//     c[3] = str4;

//     printf("%s\n", c[3]);
// }