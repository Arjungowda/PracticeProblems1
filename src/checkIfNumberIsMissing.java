/**
 * Created by mandy on 2/23/2016.
 */
public class checkIfNumberIsMissing {

    public static void main(String[] args){
        int[] arr = {5,1, 7,3};
        boolean f = isMissingNumber(arr);
        if(f)
            System.out.print("No missing number found");
        else System.out.print("Missing number found");
    }

    public static boolean isMissingNumber(int[] iArray){
        int ii, iDistance;

	/* Find the distance between first two elements of the array */
        iDistance = iArray[1] - iArray[0];

	/* Check for the arithmetic sequence */
        for (ii = 1; ii < iArray.length-1; ++ii)
        {
            if ((iArray[ii+1] - iArray[ii]) % iDistance != 0)
                return false;
        }

        return true;
    }
}
