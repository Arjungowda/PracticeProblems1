/**
 * Created by mandy on 3/11/2016.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Here are few examples.
 [1,3,5,6], 5 → 2
 [1,3,5,6], 2 → 1
 [1,3,5,6], 7 → 4
 [1,3,5,6], 0 → 0
 */
public class searchInsertPosition {

    public static void main(String[] args){
        int[] nums = {1,3};
        int target = 4;
        int index = searchInsert(nums,target);
        System.out.print(index);
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int index = functionCall(nums,target);
        return index;
    }
    public static int i = 0;
    public static int functionCall(int[] nums,int val)
    {

        if(val == nums[0])
            return 0;
        else if(val>nums[0] && nums.length==1)
            return 1;
        else if(val<nums[0])
            return 0;

        else
        {
            for(i=1;i<nums.length;i++)
            {
                if(nums[i]==val)
                    return i;
                else if(val < nums[i])
                    return i;

            }

        }
        return i;


    }
}
