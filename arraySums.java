/**
 * Created by mandy on 3/7/2016.
 */
public class arraySums {
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,8};
        int[] res = sumArray(arr1,arr2);
        int[] x = res;
    }

    public static int[] sumArray(int[] arr1,int[] arr2)
    {
        if(arr1.length == 0)
            return arr2;
        if(arr2.length == 0)
            return arr1;
        int l1 = arr1.length, l2 = arr2.length, carry = 0, sum = 0;

        int k =0;
        if(l1>l2)
            k = l1;
        else k = l2;
        int[] resArr = new int[k];
        l1--;
        l2--;
        k--;
        while(l1>=0 && l2>=0)
        {
            sum = arr1[l1--]+arr2[l2--]+carry;
            carry = 0;
            if(sum>9){
                int temp = sum;
                carry = temp/10;
                sum = sum/10;
            }
            resArr[k--] = sum;
        }

        return resArr;
    }
}
