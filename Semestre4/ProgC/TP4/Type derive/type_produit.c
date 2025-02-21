#include "type.h"

typedef struct
{
    unsigned char day;
    month_t month;
    short year;
} date_t;

// 1] sizeof(day) = 12
// 2] sizeof(day) = 16

date_t date(unsigned char d, month_t m, short y)
{
    date_t date;

    date.day = d;
    date.month = m;
    date.year = y;
    return (date);
}

void print_date(date_t d)
{
    printf("%c / ", d.day);
    print_month(d.month);
    printf(" / %i", d.year);
}

// int main()
// {
//     date_t day;
//     printf("%i\n", sizeof(char));
//     printf("%i\n", sizeof(short));
//     printf("%i\n", sizeof(month_t));
//     printf("%i", sizeof(day));
// }