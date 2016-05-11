package JP0608_2;

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

    private int calorie;
    private Vector content;
}