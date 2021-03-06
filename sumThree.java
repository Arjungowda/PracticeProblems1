import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mandy on 1/24/2016.
 */
public class sumThree {
    public static void main(String[] args){
        int[] nums = {1,3,2,4,-1,0};
        List<List<Integer>> res = threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int low=i+1;
            int high = nums.length-1;
            int sum = -nums[i];
            while(low<high){
                if(nums[low]+nums[high]==sum){
                    res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    while(low<high && nums[low]==nums[low+1]) low++;
                    low++;
                    while(low<high && nums[high]==nums[high-1]) high--;
                    high--;
                }else if(nums[low]+nums[high]>sum){
                    while(low<high && nums[high]==nums[high-1]) high--;
                    high--;
                }
                else{
                    while(low<high && nums[low]==nums[low+1]) low++;
                    low++;
                }

            }

        }
        return res;
    }
}
