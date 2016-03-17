import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mandy on 2/24/2016.
 */
public class findOddRepeatedNumber {

    public static void main(String[] args){
        int[] arr = {1,6,7,8,9,1,6,7,9};
        int OddNum = findOddRereatedNumber(arr);
        if(OddNum != 0)
            System.out.print(OddNum);
        else
            System.out.print("All numbers are repeated even times");
    }

    public static int findOddRereatedNumber(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = arr.length;
        len-=1;
        while(len>=0){
            if(map.containsKey(arr[len]))
                map.put(arr[len],map.get(arr[len])+1);
            else
                map.put(arr[len],1);
            len-=1;
        }

      Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            if((int)entry.getValue()%2!=0)
                return (int)entry.getKey();
            itr.remove();
        }
        return 0;
    }
}
