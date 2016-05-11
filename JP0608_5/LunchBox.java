package JP0608_5;

import java.util.Iterator;
import java.util.Vector;

class LunchBox
{

    LunchBox()
    {
        content = new Vector();
    }

    void add(Food food)
    {
        content.add(food);
    }

    int getCalorie()
    {
        int i = 0;
        for(Iterator iterator = content.iterator(); iterator.hasNext();)
        {
            Food food = (Food)iterator.next();
            i += food.getCalorie();
        }

        return i;
    }

    void setPriceRatio(double d)
    {
        priceRatio = d;
    }

    double getPrice()
    {
        int i = 0;
        for(Iterator iterator = content.iterator(); iterator.hasNext();)
        {
            Food food = (Food)iterator.next();
            i += food.getCost();
        }

        return (double)i * priceRatio;
    }

    Vector getContent()
    {
        return content;
    }

    String isCheaperThan(LunchBox lunchbox)
    {
        if(getPrice() < lunchbox.getPrice())
            return "YES!";
        else
            return "NO!";
    }

    private int calorie;
    private Vector content;
    private double priceRatio;
}