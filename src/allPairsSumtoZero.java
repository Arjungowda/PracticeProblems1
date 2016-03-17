import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by mandy on 3/7/2016.
 */
public class allPairsSumtoZero {
    public static void main(String[] args)
    {
        int[] arr = {-3,4,6,3,0,0,2};
        printAllPairsThatSumstoZero(arr);
    }
    static void printAllPairsThatSumstoZero(int[] arr){
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        for(int i=0; i<arr.length ; i++)
            map.put(arr[i],true);

        for(int i=0;i<arr.length ; i++)
        {
            int t = -arr[i];
            if(map.containsKey(t) && map.get(t)){
                System.out.println(t +" "+arr[i]);
                map.put(arr[i],false);
            }
        }
        return;
    }
}
