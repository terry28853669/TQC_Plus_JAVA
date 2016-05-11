package JP0608_2;

abstract class Food
{

    Food()
    {
    }

    Food(int i)
    {
        amount = i;
    }

    void setCaloriePerGram(int i)
    {
        calorie = i;
    }

    int getAmount()
    {
        return amount;
    }

    int getCalorie()
    {
        return amount * calorie;
    }

    private int amount;
    private int calorie;
}
