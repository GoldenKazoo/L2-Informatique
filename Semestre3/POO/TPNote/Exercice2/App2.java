public class App2
{
    public static void main(String[] args)
    {
        Zoo savigny = new Zoo("Le zoo de Sav");
        Vegetable haricot = new Vegetable("Harico", true, false);
        Omnivore singe = new Omnivore("Singe", savigny, "Ouahaha", 50, 20);
        Carnivore loup = new Carnivore("loup", savigny, "Aouuu", 30, 100);
        Herbivore gazelle = new Herbivore("gazelle", savigny, "Hiiiii", 5, 200);
        
        singe.feed(haricot);
        loup.feed(haricot);
        gazelle.feed(haricot);
        

        savigny.add(singe);
        savigny.add(loup);
        savigny.add(gazelle);
        savigny.call();
    }
}
