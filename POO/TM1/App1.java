import java.util.*;

public class App1
{
    public static void main(String[] args)
    {
        int nb1;
        int nb2;
        
        Scanner scanner = new Scanner(System.in);
        nb1 = scanner.nextInt();
        nb2 = scanner.nextInt();
        if (nb1 % 2 == 0)
        {
            System.out.println("Gg wp c'est bien un nombre pair");
        }
        
        System.out.println("Somme =" + (nb1 + nb2));
        System.out.println("Somme =" + nb1 + nb2);
        System.out.println("Difference =" + (nb1 - nb2));
        System.out.println("Produit =" + (nb1 * nb2));
        if (nb2 != 0)
        {
            System.out.println("Quotient =" + nb1 / nb2);
            System.out.println("Reste =" + nb1 % nb2);
        }
    }
}
