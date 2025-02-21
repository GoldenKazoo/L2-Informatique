#include <stdio.h>
#include <stdlib.h>
 
int main() {
  int    prod_num[3] = { 23, 42, 0 };
  char*  prod_name[3] = { "muffins", "cookies", "croissant" };
  int    id = -1;
  int    n;
  printf("Entrez un identifiant de produit : ");
  scanf("%d", &id);
  if (id >= 3) {
    printf("Cet identifiant n'existe pas.\n");
    return EXIT_FAILURE;
  }
 
  printf("Entrez le nouveau nombre de %s : ", prod_name[id]);
  scanf("%d", &n);
  printf("Avant, il restait %d %s en stock.\n", prod_num[id], prod_name[id]);
  prod_num[id] = n;
  printf("Maintenant, il y a %d %s en stock.\n", prod_num[id], prod_name[id]);
 
  return EXIT_SUCCESS;
}