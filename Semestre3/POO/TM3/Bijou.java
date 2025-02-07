public class Bijou
{
    int     valeur;
    String  marque;
    
    public  Bijou()
    {
        this.valeur = 0;
        this.marque = "placeholder";
    }
    public  Bijou(int valeur, String marque)
    {
        this.valeur = valeur;
        this.marque = marque;
    }
    
    public int valeur()
    {
        return(this.valeur);
    }
    
    public String  marque()
    {
        return (this.marque);
    }
}
