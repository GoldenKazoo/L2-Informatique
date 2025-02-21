    #ifndef TYPE_H
    #define TYPE_H

    #include <stdlib.h>
    #include <stdio.h>
    
    typedef enum
    {
        Janvier = 1,
        Fevrier = 2,
        Mars = 3,
        Avril = 4,
        Mai = 5,
        Juin = 6,
        Juillet = 7,
        Aout = 8,
        Septembre = 9,
        Octobre = 10,
        Novembre = 11,
        Decembre = 12,
        Jan = Janvier,
        Fev = Fevrier,
        Mar = Mars,
        Avr = Avril,
        // Mai = 5,
        Jui = Juin,
        Juil = Juillet,
        Aou = Aout,
        Sep = Septembre,
        Oct = Octobre,
        Nov = Novembre,
        Dec = Decembre
    } month_t;

    typedef struct
    {
    unsigned char day;
    month_t month;
    short year;
    } date_t;

    void print_month(month_t m);

    #endif