

public class Omnivore extends Animal
{
    public Omnivore(String name, Zoo zoo, String sound, int strength, int speed)
    {
        super(name, zoo, sound, strength, speed);
    }

    @Override
    public void feed (Food food)
    {
        int before1;
        int before2;

        before1 = 0;
        if (food.is_vegetable == true)
        {
            before1 = super.speed;
            super.speed = super.speed + 10;
        }
        System.out.println(super.name + " speed was " + before1 + " and is now " + super.speed);
        before2 = 0;
        if (food.is_vegetable == true)
        {
            before2 = super.strength;
            super.strength = super.strength + 10;
        }
        System.out.println(super.name + " strength was " + before2 + " and is now " + super.strength);
    }
}
