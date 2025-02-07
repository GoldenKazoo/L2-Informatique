public class Carnivore extends Animal
{
    public Carnivore(String name, Zoo zoo, String sound, int strength, int speed)
    {
        super(name, zoo, sound, strength, speed);
    }

    @Override
    public void feed (Food food)
    {
        int before;

        before = super.strength;
        if (food.is_meat == true)
        {
            super.strength = super.strength + 10;
        }
        System.out.println(super.name + " strength was " + before + " and is now " + super.strength);
    }
}
