public class Bague extends Bijou
{
    private int taille;
    
    public  Bague(int valeur, String marque, int taille)
    {
        super(valeur, marque);
        this.taille = taille;
    }
    public  void value()
    {
        this.valeur = taille * 3;
    }
    
    public int taille()
    {
        return(this.taille);
    }
}
