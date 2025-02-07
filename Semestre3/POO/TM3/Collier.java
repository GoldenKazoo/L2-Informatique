
public class Collier extends Bijou
{
    private int perle;

    public  Collier(int valeur, String marque, int perle)
    {
        super(valeur, marque);
        this.perle = perle;
    }
    public int nombre_de_perle(int y)
    {
        return(this.perle);
    }
}
