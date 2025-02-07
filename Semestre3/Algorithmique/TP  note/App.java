/**
 * Classe App
 * 
 * Ce fichier est le seul que vous aurez à modifier.
 */
public class App
{
    public static int exercice1(ListeSC list)
    {
        int sum;

        sum = 0;
        while(list.tete.suiv != null)
        {
            if(list.tete.val <= 32)
            {
                sum = sum + list.tete.val;
            }
            list.tete =  list.tete.suiv;
        }
        sum = sum + list.tete.val;
        return (sum);
    }

    public static MaillonSC exercice2(ListeSC list)
    {
        if(list == null)
            return(list.tete);
        while(list.tete.suiv != null)
        {
            list.tete = list.tete.suiv;
        }
        return(list.tete);
    }

    public static ListeSC exercice3(int[] tab)
    {
        ListeSC     list;
        MaillonSC   head;
        MaillonSC   head_traveler;
        int         i;

        i = 1;
        head = new MaillonSC(tab[0]);
        head_traveler = head;
        list = new ListeSC();
        while (i < tab.length)
        {
            if (tab[i] <= 32)
            {
                head_traveler.suiv = new MaillonSC(tab[i]);
                head_traveler = head_traveler.suiv;
                i++;
            }
            else
                i++;
        }
        list.tete = head;
        return (list);
    }
    
    public static boolean exerciceBonus(ListeSC list)
    {
        // TODO
        return false;
    }
    
    public static void print_list(ListeSC  list)
    {
        while(list.tete.suiv != null)
        {
            System.out.println(list.tete.val);
            list.tete = list.tete.suiv;
        }
         System.out.println(list.tete.val);
    }
    /**
     * main (utilisable à des fins de test)
     */
    public static void main(String[] args)
    {
        int[] tab = new int [10];
        ListeSC list;
        tab[0] = 0;
        tab[1] = 1;
        tab[2] = 2;
        tab[3] = 50;
        tab[4] = 4;
        tab[5] = 5;
        tab[6] = 6;
        tab[7] = 7;
        tab[8] = 8;
        tab[9] = 9;
    

    }
}
