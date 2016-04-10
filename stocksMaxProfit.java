import java.util.Map;

/**
 * Created by mandy on 2/23/2016.
 */
public class stocksMaxProfit {
    public static void main(String[] args){
        int[] arr = {10,50,45,19,55,23,16};
        int maxProfit = maxProfit(arr);
        System.out.print(maxProfit);
    }
    public static int maxProfit(int[] arr){
        int profit = 0;
        int minElement = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            profit = Math.max(profit,arr[i]-minElement);
            minElement = Math.min(minElement,arr[i]);
        }
        return profit;
    }
}
