/**
 * Created by mandy on 1/25/2016.
 */
public class moveZeroes {
    public static void main(String[] args){
        int[] arr = {1,2,0,5,0,7,8};
        moveZeroes1(arr);
    }

    public static void moveZeroes1(int[] nums) {
        int j = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(int a: nums)
            System.out.print(a);
    }
}
