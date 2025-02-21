#include <stdio.h>
#include <stdlib.h>
void ft_convert_float(int integer)
{
    if (integer < 16777250 && integer > 16777200)
    {
        (float)integer;
    }
}
int main()
{
    double f;

  for (f = 1.0; f != 0.0; f -= 0.1) {
    ft_convert_float(f);
    printf("%g\n", f);
    if (f < 0.0) exit(EXIT_FAILURE);
  }
}