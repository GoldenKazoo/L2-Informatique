#include <stdio.h>

void ft_print_tab(int *tab, char format, int index)
{
        if (format == 'd')
            printf("%d\n", tab[index]);
        if (format == 'u')
            printf("%u\n", tab[index]);
        if (format == 'o')
            printf("%o\n", tab[index]);
         if (format == 'x')
            printf("%x\n", tab[index]);
         if (format == 'X')
            printf("%X\n", tab[index]);
         if (format == 'c')
            printf("%c\n", tab[index]);
}
int main()
{
    int entier[10] = { 0, -0, -1, 11, 96, 4567, -255, 582, 2147483700, 4294967416 };
    int i = 0;
    while (i < 10)
    {
        ft_print_tab(entier, 'd', i);
        i++;
    }
    printf("\n");
    i = 0;
    while (i < 10)
    {
        ft_print_tab(entier, 'u', i);
        i++;
    }
     printf("\n");
    i =0;
       while (i < 10)
    {
        ft_print_tab(entier, 'o', i);
        i++;
    }
     printf("\n");
    i = 0;
       while (i < 10)
    {
        ft_print_tab(entier, 'x', i);
        i++;
    }
     printf("\n");
    i = 0;
       while (i < 10)
    {
        ft_print_tab(entier, 'X', i);
        i++;
    }
     printf("\n");
    i = 0;
       while (i < 10)
    {
        ft_print_tab(entier, 'c', i);
        i++;
    }
}