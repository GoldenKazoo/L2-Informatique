

public abstract class Food
{
    String  food_name;
    boolean is_vegetable;
    boolean is_meat;

    public Food(String name, boolean vegetable, boolean meat)
    {
        this.food_name = name;
        this.is_vegetable = vegetable;
        this.is_meat = meat;
    }

    
}
