public abstract class Animal
{
    String  name;
    Zoo  zoo;
    String  sound;
    int     strength;
    int     speed;

    public Animal(String name, Zoo zoo, String sound, int strength, int speed)
    {
        this.name = name;
        this.zoo= zoo;
        this.sound = sound;
        this.strength = strength;
        this.speed = speed;
    }
    public String toString()
    {
        return(name + " is saying : " + sound);
    }
    public void feed (Food food)
    {

    }
}