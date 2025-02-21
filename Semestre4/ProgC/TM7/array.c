#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void* array_alloc(size_t len, size_t sz)
{
    void *new_addr;

    size_t jump;

    jump = 0;
    if (len == 0 || sz == 0)
        return NULL;
    new_addr = malloc (sz * len + 2 * sizeof(size_t));
    if (!new_addr)
        return NULL;
        memcpy(new_addr, (void)sz, 8);
        new_addr = new_addr + 8;
        memcpy(new_addr, len, 8);
        new_addr = new_addr + 8;
    return (new_addr);
}

void array_free(void *a)
{
    if (a != NULL)
        return ;
    else
    free(a);
}

size_t array_element_size(void* a)
{
    size_t  size_element;
    
    size_element = (size_t) sizeof(a[0]);
    return (size_element);
}

size_t array_length(void* a)
{
    size_t  size_element;
    
    size_element = (size_t) sizeof(a[1]);
    return (size_element);   
}

void* array_make(size_t len, size_t sz, const void* p)
{
    void *new_addr;

    if (len == 0 || sz == 0)
        return NULL;
    new_addr = malloc (sizeof(sz) * len + 2);
    if (!new_addr)
        return NULL;
    while (new_addr)
    {
        new_addr = p;
        new_addr++;
    }
}

int main() {
  double* a1;
  int* a2;
  int i;
 
  // Un tableau de 100 valeurs flottantes
  a1 = (double*)array_alloc(100, sizeof(double));
  printf("element size: %lu\n", (unsigned long)array_element_size(a1));
  printf("array length: %lu\n", (unsigned long)array_length(a1));
 
  // Un tableau de 1000 valeurs entières initialisées à 123
  int x = 123;
  a2 = (int*)array_make(1000, sizeof(int), &x);
  for(i = 0; i < 10; i++)
    printf("%d ", a2[i]);   // Affichage des 10 premières valeurs
 
  array_free(a1);
  array_free(a2);
 
  return EXIT_SUCCESS;
}