
public class Typhanny
{
    public int     size;
    public Bijou[] box;

    public Typhanny(int size)
    {
        this.size = size;
        this.box = new Bijou[size];
        size--;
        while(size >= 0)
        {
            this.box[size] = new Bijou();
            size--;
        }
    }

    public int collection()
    {
        int i;
        int total;
        
        i = 0;
        total = 0;
        while(i < box.length)
        {
            total = total + box[i].valeur;
            i++;
        }
        return total;
    }
}
