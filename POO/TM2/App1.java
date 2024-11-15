import java.lang.*;

public class App1
{
    public static void main(String args[])
    {
        int x;
        int y;
        int sum;
        int sub;
        int mult;
        int div;
        int mod;
        try
        {
            
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        
            System.out.println(sum = x + y);
            System.out.println(sub = x - y);
            System.out.println(mult = x * y);
            try
            {
                System.out.println(div = x / y);
                System.out.println(mod = x % y);
            }
            catch(ArithmeticException e)
            {
                System.out.println("y egal a 0");
                e.printStackTrace();
            }
        }
        catch(NumberFormatException f)
        {
            System.out.println("Arguments invalides, entrez 2 nombres entiers");
            f.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("1 seul argument entree ");
            a.printStackTrace();
        }
    }
}
