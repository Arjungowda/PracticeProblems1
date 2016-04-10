import java.util.HashMap;

/**
 * Created by mandy on 2/8/2016.
 */
//First question was to find all numbers that occurred an   odd-number of times in an array
public class oddNumberofTimesinArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1,2,3,4,5,4,2};
        int count = checkOddCountNumbers(arr);
        System.out.println("Number of odd numbers in the given array:");
        System.out.print(count);
    }

    public static int checkOddCountNumbers(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length-1;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            int val = map.get(arr[i]);
            if(val%2 != 0)
                count++;
        }
        return count;
    }

}
