import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by mandy on 2/19/2016.
 */
public class targetsum {
    public static void main(String[] args){
        int[] arr = {1,2,1};
        targetsum t = new targetsum();
        String str= "arjunaA isA thhA esdnuA www";
        List<String> list = new ArrayList<String>(Arrays.asList(str.split("A ")));
        for(int i=0;i<list.size();i++)
        {
            System.out.println(" -->"+list.get(i));
            char[] s = list.get(i).toCharArray();
        }
        String newStr = removeDuplicates(str);

        System.out.println("Duplicates removes string :");
        System.out.print(newStr);


        //boolean f = t.containsNearbyAlmostDuplicate(arr, 1, 1);
        //System.out.print(f);
    }

    public static String removeDuplicates(String s)
    {
        if(s == null || s.length() < 2) return s;
        HashSet<Character> map = new HashSet<Character>();
        String sb = "";
        char[] charArr = s.toCharArray();
        int n = charArr.length;
        int i = 0;
        while(i<n)
        {
            if(!map.contains(charArr[i]))
            {
                map.add(charArr[i]);
                sb+=charArr[i];
            }
            i++;
        }
        return sb;
    }











    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length == 0 ||nums.length == 1 || k <= 0 || t < 0  ) return false;
        if(t == 0)
            return true;
        int i = 0;
        int j = k;
        while(i < nums.length){
            while(j < nums.length){
                if(nums[i]-nums[j] >= t && j <= k)
                    return true;
                j++;
            }
            i++;
            j = k+1;
        }
        return false;
    }
}
//