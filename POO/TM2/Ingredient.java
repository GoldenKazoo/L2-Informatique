
/**
 * Décrivez votre classe Ingredient ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Ingredient
{
    private String  name;
    private int     weight;

    public Ingredient(String name, int weight)
    {
       this.name = name;
       this.weight = weight;
    }
    
    public String get_name()
    {
        return (this.name);
    }
    
    public int get_weight()
    {
        return (this.weight);
    }
    
    public void set_name(String new_name)
    {
        this.name = new_name;
    }
    
    public void set_weight(int new_weight)
    {
        this.weight = new_weight;
    }
    
    @Override
    public String toString()
    {
        return (name + " = " + weight + " g");
    }
}
