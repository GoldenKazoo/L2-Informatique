import java.util.ArrayList;

public class Basket
{
    ArrayList<Toy> basket;

    public void add(Toy jouet)
    {
        basket.add(jouet);
    }

    public void remove(Toy jouet, int numero)
    {
        basket.remove(numero);
    }

    public int sum()
    {
        int sum;

        sum = 0;
        for(Toy jouets : basket)
        {
            sum = sum + jouets.price;
        }
        return (sum);
    }

    public ArrayList<Toy> match_color(int[] color)
    {
        ArrayList<Toy> new_basket = new ArrayList<>();

        for(Toy jouet : basket)
        {
            if (jouet.color[0] == color[0] && jouet.color[1] == color[1] && jouet.color[2] == color[2])
            {
                new_basket.add(jouet);
            } 
        }
        return (new_basket);
    }

    public void fuse (Basket src)
    {
        for(Toy jouet : src.basket)
        {
            basket.add(jouet);
        }
    }
}