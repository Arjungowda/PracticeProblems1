/**
 * Created by mandy on 2/5/2016.
 */
public class zigZag {

    public static void main(String[] args){
        int[] arr = { 10, 22, 9, 33, 49, 50, 31, 60 };
        int n = arr.length;
        System.out.print("Length of longest zigZag subsequence is \n");
        System.out.print(zzis(arr,n));
    }
    public static int zzis(int[] arr, int n){
        int[][] zz = new int[n][2];

        for(int i = 0; i < n; i++)
            zz[i][0] = zz[i][1] = 1;

        int res = 1;

        for(int i = 0; i< n ;i++){
            for(int j = 0;j < i;j++){
                if((arr[j] < arr[i]) && (zz[i][0] < zz[j][0] + 1)){
                    zz[i][0] = zz[j][0] + 1;
                }
                if((arr[j] > arr[i]) && (zz[i][0] > zz[j][0] + 1)){
                    zz[i][0] = zz[j][0] + 1;
                }

            }

            if(res < max(zz[i][0], zz[i][1]))
                res = max(zz[i][0], zz[i][1]);
        }
        return res;
    }
    public static int max(int i, int j){
        if (i<=j){
            return j;
        }
        return i;
    }
}
