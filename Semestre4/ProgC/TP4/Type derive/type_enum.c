    #include <stdlib.h>
    #include <stdio.h>

    // typedef enum
    // {
    //     Janvier,
    //     Fevrier,
    //     Mars,
    //     Avril,
    //     Mai,
    //     Juin,
    //     Juillet,
    //     Aout,
    //     Septembre,
    //     Octobre,
    //     Novembre,
    //     Decembre
    // } t_month;

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

    void print_month(month_t m)
    {
        switch (m)
        {
            case Janvier : printf("Janvier"); break;
            case Fevrier : printf("Fevrier"); break;
            case Mars : printf("Mars"); break;
            case Avril : printf("Avril"); break;
            case Mai : printf("Mai"); break;
            case Juin : printf("Juin"); break;
            case Juillet : printf("Juillet"); break;
            case Aout : printf("Aout"); break;
            case Septembre : printf("Septembre"); break;
            case Octobre : printf("Octobre"); break;
            case Novembre : printf("Novembre"); break;
            case Decembre : printf("Decembre"); break;
        }
    }
    // Type enregistrement 
     
    /// la définition du type date_t est à mettre ici
     
    // Type union
     
    /// la définition du type timestamp_t est à mettre ici
     
    // int main()
    // {
    //     size_t size;
    //     month_t m = Mai;
    //     size = sizeof(m);
    //     printf("%i", Janvier);
    //     print_month(m);
    //     return EXIT_SUCCESS;
    // }

