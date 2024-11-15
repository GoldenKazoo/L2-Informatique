
/**
 * Décrivez votre classe Point ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Point
{
    private double x;
    private double y;
    /**
     * Constructeur d'objets de classe Point
     */
    public Point()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void set_x(double newX)
    {
        this.x = newX;
    }
    
    public double get_x()
    {
        return (this.x);
    }
    
    public String toString ()
    {
        return "(" + this.x + "," + this.y + ")";
    }
    public double dist (Point other)
    {
        return Math.abs(other.x - this.x) + Math.abs(other.y - this.y);
    }
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    //
    public static void print_x_y(int x, int y)
    {
        Point p = new Point ();
        System.out.println(p.x + " " + p.y);
    }
}
