public class Couronne extends Bijou
{
    private boolean royale;

    public Couronne(int valeur, String marque, boolean royale)
    {
        super(valeur, marque);
        this.royale = royale;
    }
    
    public  boolean royale()
    {
        if (royale == true)
        {
            this.valeur = 10000;
            return (true);
        }
        return (false);
    }
    
    public int valeur()
    {
        royale();
        return(this.valeur);
    }
}
