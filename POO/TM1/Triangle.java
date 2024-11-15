
/**
 * Décrivez votre classe Triangle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Triangle
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Point p1;
    private Point p2;
    private Point p3;
    
    

    public String toString ()
    {
        return "(" + this.p1 + "," + this.p2 + this.p3 + ")";
    }
    

    /**
     * Constructeur d'objets de classe Triangle
     */
    public Triangle(Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public double sampleMethod(int y)
    {
        // Insérez votre code ici
        return (0.5 *((this.p1.get_x() - this.p3.get_x()) *(this.p2.get_y() -this.p3.get_y() - (this.p1.get_y() - this.p3.get_y()) *(this.p2.get_y() - this.p3.get_y()))));
    }
}
