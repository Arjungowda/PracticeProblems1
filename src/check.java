import java.util.HashSet;

/**
 * Created by mandy on 2/24/2016.
 */
public class check {
    public static void main(String[] args){
        int[] arr = {1,2,1,4,5,6};
        if(checkFunc(arr))
            System.out.print("True");
        else
            System.out.print("False");
    }

    public static boolean checkFunc(int[] nums){
        if(nums.length == 0)return false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;
    }
}
