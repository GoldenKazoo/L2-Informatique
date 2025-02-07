import java.util.Scanner;

public class App2
{
    public static void main(String[] args)
    {
        int         i;
        Scanner     scan;
        Typhanny    collection;
        
        i = 0;
        collection = new Typhanny(5);
        scan = new Scanner(System.in);
        while(i < collection.size)
        {
          //  System.out.println("Entrez la valeur du bijou");
         //   collection.box[i].valeur = scan.nextInt();
            System.out.println("Entrez la marque du bijou");
            collection.box[i].marque = scan.nextLine();
            if (collection.box[i].marque == "Bulgari")
                System.out.println("Banco");
            collection.box[i].valeur = collection.box[i].valeur();
            i++;
        }
        collection.box[3].royale = true;
        int aled = collection.collection();
        System.out.println(aled);
    }
}