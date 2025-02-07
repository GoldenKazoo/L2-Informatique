#include <stdio.h>
#include <stdlib.h>

int main()
{
  int index1;
  int index2;
  int pos;

  index1 = 0;
  index2 = 0;
  pos = 0;
  int grille[5][5] = 
  {
    {0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0}
  };

  while (index1 < 5)
  {
    while (index2 < 5)
    {
      if (grille[index1][index2] == 0)
      {
        pos = (index1 * 5) + index2;
        printf("0 se trouve a l'index %i\n", pos);
        exit(0);
      }
      index2++;
    }
    index2 = 0;
    index1++;
  }
  exit(1);
}
