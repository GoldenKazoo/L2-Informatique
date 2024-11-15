
/**
 * Décrivez votre classe App ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class App
{ 
    public static void main (String[] args)
    {
        A   box1;
        B   obj1;
        
        A   box2;
        B   obj2;
        
        A   fbox;
        B   fobj;
        
        //obj1 = new B();
        //box1 = obj1;
        //box2 = new A();
        // obj2 = box2; Donne une erreur : Imcompatible type
          
        fbox = new A();
        fobj = new B();
        
        //fbox.f();
        //fobj.f();
        
        fbox.f();
        fobj.f();
        
    }
}
