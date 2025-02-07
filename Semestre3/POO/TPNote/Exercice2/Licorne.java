public class Licorne extends Herbivore
{
    public Licorne(String name, Zoo zoo, String sound, int strength, int speed)
    {
        super(name, zoo, sound, strength, speed);
    }

    @Override
    public String toString()
    {
        Food meat = new Meat("Viande", false, true);
        for(Animal animal : zoo.zoo)
        {
            animal.feed(meat);
        }
        return(name + " is saying : " + sound);
    }
}
