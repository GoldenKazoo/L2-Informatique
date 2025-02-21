#include "polynome.h"

void print_size_type()
{
    size_t size;

    size = sizeof(polynomial);
    printf("%i", size);
}

polynomial zero_polynomial()
{
    polynomial polynome;
    int i;

    polynome.degree = 0;
    i = 0;
    while (polynome.a[i])
    {
        polynome.a[i] == 0;
        i++;
    }
}

int main()
{
    zero_polynomial();
    print_size_type();
}