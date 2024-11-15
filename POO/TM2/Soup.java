import java.util.ArrayList;
import java.lang.Object;

public class Soup
{
    private ArrayList<Ingredient> soupArray = new ArrayList<>();

    public Soup()
    {
        
    }
    
    public void add(Ingredient new_ingredient)
    {
        int i;
        boolean checker;
        
        checker = false;
        i = 0;
        while (i < this.soupArray.size())
        {
            if (soupArray.get(i).get_name().equals(new_ingredient.get_name()))
                checker = true;
            i++;
        }
        if (checker == false)
            soupArray.add(new_ingredient);
    }
    
    public int totalWeight()
    {
        int i;
        int total;
        
        i = 0;
        total = 0;
        while (i < this.soupArray.size())
        {
            total = total + (soupArray.get(i)).get_weight();
            i++;
        }
        return (total);
    }
    
    public int portions()
    {
        return (totalWeight() / 250);
    }
}
