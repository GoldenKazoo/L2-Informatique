#include <stdio.h>
#include <stdlib.h>

int get_rest(unsigned int nb)
{
    int reste;

    reste = 0;
    while(nb == 1 || nb == 0)
    {
        nb = nb / 2;
    }
}
void printbin(unsigned int nb)
{
    int reste;

    reste = 0;
    while (nb != 0)
    {
        reste = get_rest(nb);
        printf("%i", reste);
        nb = nb / 2;
    }
}

int main(int argc, char **argv)
{
    int nb;

    nb = atoi(argv[1]);
    printbin(nb);
}