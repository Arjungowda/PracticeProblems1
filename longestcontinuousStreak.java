/**
 * Created by mandy on 2/18/2016.
 */
public class longestcontinuousStreak {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1,0,1,1};
        int m = 2;
        int maxCount = 0;
        int zeroCount = 0;
        int oneCount = 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) oneCount++;
            else if(arr[i] == 0){
                zeroCount++;
                if(zeroCount <= m){ //change to m****
                    oneCount++;
                    if(zeroCount == 1)
                        j = i+1;
                }
                else{
                    if(oneCount > maxCount)
                        maxCount = oneCount;
                    i = j;
                    zeroCount = 0;
                    oneCount = 0;
                }
            }
        }
        if(oneCount > maxCount)
            maxCount = oneCount;
        System.out.print(maxCount);
    }
}