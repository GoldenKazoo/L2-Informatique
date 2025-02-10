#include <stdio.h>
#include <stdlib.h>

int ft_strlen(char *word)
{
  int i;

  i = 0;
  while (word[i] != '\0')
  {
    i++;
  }
  return (i);
}

int main(int argc, char **argv)
{
  char *new_word;
  char *letter;
  int i;
  int m;
  int k;

  i = 0;
  new_word = malloc(sizeof(char) * ft_strlen(argv[1]));
  if (argc != 4)
  {
    return (1);
  }
  m = atoi(argv[2]);
  k = atoi(argv[3]);
  while (argv[1][i] != '\0')
  {
    new_word[i] = 'A' + ((argv[1][i] * m) + k) % 26;
    i++;
  }
  new_word[i] = '\0';
  printf("%s", new_word);
}
