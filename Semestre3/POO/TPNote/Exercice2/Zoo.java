import java.util.ArrayList;

public class Zoo
{
    String name;
    ArrayList<Animal> zoo = new ArrayList<>();

    public Zoo(String name)
    {
        this.name = name;
    }

    public void add(Animal animal)
    {
        zoo.add(animal);
    }

    public void call()
    {
        for(Animal animal: zoo)
        {
            System.out.println(animal.toString());
        }
    }
}
