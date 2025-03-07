#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void	*ft_memcpy(void *dest, const void *src, size_t size)
{
	size_t	i;
	char	*d;
	char	*s;

	i = 0;
	d = (char *) dest;
	s = (char *) src;
	if (!src && !dest)
		return (NULL);
	while (i < size)
	{
		d[i] = s[i];
		i++;
	}
	return (d);
}

void* array_alloc(size_t len, size_t sz)
{
    size_t *new_addr;

    if (len == 0 || sz == 0)
        return NULL;
    new_addr = malloc (sz * len + 2 * sizeof(size_t));
    if (!new_addr)
        return NULL;
    new_addr[0] = len;
    new_addr[1] = sz;
    return (new_addr + 2);
}

void array_free(void *a)
{
    if (a != NULL)
        return ;
    else
    free((size_t *)a - 2);
}

size_t array_element_size(void* a)
{
    size_t  size_element;
    
    size_element = (size_t) sizeof(size_t);
    return (size_element);
}

size_t array_length(void* a)
{
    size_t  size_element;
    
    size_element = (size_t) sizeof(size_t);
    return (size_element);   
}

void* array_make(size_t len, size_t sz, const void* p)
{
    char *new_addr = array_alloc(len,  sz);
    for(int i = 0; i < len; i++)
    {
        memcpy(new_addr + i * sz, p, sz);
    }
    return (new_addr);
}

array_init(size_t len, size_t sz, void (*f)(int i, void* ei))
{
    char *new_addr = array_alloc(len,  sz);
    for(int i = 0; i < len; i++)
    {
        f(i, new_addr + i * sz);
    }
    return (new_addr);
}

void array_iter(void (*f)(const void* ei), const void* a)
{
    
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


