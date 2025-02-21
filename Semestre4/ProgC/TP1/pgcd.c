#include <stdio.h>
#include <stdlib.h>
 
int main(int argc, char **argv)
{
    if (argc != 3)
    {
        return (EXIT_FAILURE);
    }
    int a = atoi(argv[1]);
    printf("%i\n", a);
    int b = atoi(argv[2]);
    printf("%i\n", b);
    while (a != b)
    {
        if (a > b)
        a = a - b;
    else
      b = b - a;
    }
 
  printf("PGCD = %d\n", a);
 
  return (EXIT_SUCCESS);
}