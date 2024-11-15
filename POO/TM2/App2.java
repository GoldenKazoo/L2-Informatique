
public class App2
{
    public static void main(String args[])
    {
        Soup le_fish_au_chocolat = new Soup();
        
        Ingredient poisson = new Ingredient("Poisson", 20);
        Ingredient poisson2 = new Ingredient("Poisson", 30);
    
        le_fish_au_chocolat.add(poisson);
        le_fish_au_chocolat.add(poisson2);
        
        System.out.println(le_fish_au_chocolat.totalWeight());
        System.out.println(le_fish_au_chocolat.portions());
        
    }
}
