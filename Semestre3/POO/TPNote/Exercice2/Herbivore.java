public class Herbivore extends Animal
{
    public Herbivore(String name, Zoo zoo, String sound, int strength, int speed)
    {
        super(name, zoo, sound, strength, speed);
    }

    @Override
    public void feed (Food food)
    {
        int before;

        before = 0;
        if (food.is_vegetable == true)
        {
            before = super.speed;
            super.speed = super.speed + 10;
        }
        System.out.println(super.name + " speed was " + before + " and is now " + super.speed);
    }
}