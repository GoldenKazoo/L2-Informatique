#include <stdio.h>
#include <stdlib.h>
 
typedef struct {
  int   num;
  char* name;
} produit_t;
 
int main() {
  produit_t stock[3];
  stock[0].num = 23;  stock[0].name = "muffins";
  stock[1].num = 42;  stock[1].name = "cookies";
  stock[2].num = 0;   stock[2].name = "croissants";
 
  int id = -1;
  int n;
  printf("Entrez un identifiant de produit : ");
  scanf("%d", &id);
  if (id >= 3) {
    printf("Cet identifiant n'existe pas.\n");
    return EXIT_FAILURE;
  }
 
  printf("Entrez le nouveau nombre de %s : ", stock[id].name);
  scanf("%d", &n);
  printf("Avant, il restait %d %s en stock.\n", stock[id].num, stock[id].name);
  stock[id].num = n;
  printf("Maintenant, il y a %d %s en stock.\n", stock[id].num, stock[id].name);
 
  return EXIT_SUCCESS;
}