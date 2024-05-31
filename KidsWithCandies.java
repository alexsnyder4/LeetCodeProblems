import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int highestValue;
        List<Boolean> boolArr = new ArrayList<Boolean>();
        for(int index = 0; index < n; index++)
        {
            highestValue = candies[index] + extraCandies;
            if (largestInArray(highestValue, candies, n))
            {
                boolArr.add(true);
            }
            else
            {
                boolArr.add(false);
            }
        }
        return boolArr;
    }

    public Boolean largestInArray(int highestValue, int[] candies, int n)
    {
        Boolean answer = true;
        for(int j = 0; j < n; j++)
        {
            if(candies[j] > highestValue)
            {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
