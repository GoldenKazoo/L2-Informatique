#include <stdlib.h>
#include <stdio.h>
 
int main() {
  int    prod_num[3] = { 23, 42, 0 };
  char*  prod_name[3] = { "muffins", "cookies", "croissant" };
  int    id = -1;
  printf("Entrez un identifiant de produit : ");
  scanf("%d", &id);
  if (id >= 3) {
    printf("Cet identifiant n'existe pas.\n");
    return EXIT_FAILURE;
  }
  printf("Il reste %d %s en stock.\n", prod_num[id], prod_name[id]);
  return EXIT_SUCCESS;
}