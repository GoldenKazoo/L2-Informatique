#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
  int i;
  int m;
  int k;
  int true_letter;
  int letter;

  i = 0;
  if (argc != 3)
  {
    return (1);
  }
  m = atoi(argv[1]);
  k = atoi(argv[2]);
  true_letter = 'A';
  while (i < 26)
  {
    letter = ((i * m) + k) % 26;
    letter = 'A' + letter;
    printf("The previous letter is : %c | The new one is : %c\n", true_letter, letter);
    true_letter++;
    i++;
  }
}
