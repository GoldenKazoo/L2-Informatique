#include <math.h>
#include <stdio.h>
#include <stdlib.h>

#define DEGRE_MAX 500
 
typedef struct {
  float          a[DEGRE_MAX + 1];
  unsigned int   degree;
} polynomial;