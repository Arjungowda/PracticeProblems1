/**
 * Created by mandy on 2/17/2016.
 */
public class mergeSort {

    private int[] array;
    private int[] tempMergeArray;
    private int len;

    public static void main(String[] args){
        int[] arr = {45,23,11,89,77,98,4,28,65,43};
        mergeSort ms = new mergeSort();
        ms.sortArr(arr);
        for(int i: arr){
            System.out.print(i);
            System.out.print(" ");
        }

    }

    public void sortArr(int[] inputArray){
        this.array = inputArray;
        this.len = inputArray.length;
        this.tempMergeArray = new int[len];
        doMergeSort(0,len-1);
    }

    private void doMergeSort(int l, int r){
        if(l < r){
            int mid = l + (r-l)/2;
            doMergeSort(l,mid);
            doMergeSort(mid+1 , r);
            mergeParts(l, mid, r);
        }
    }

    private void mergeParts(int l, int mid, int r){
        for(int i = l;i<r;i++)
            tempMergeArray[i] = array[i];

        int i = l;
        int j = r;
        int k = mid+1;
        while(i <= mid && j<= r){
            if(tempMergeArray[i] <= tempMergeArray[j]){
                array[k++] = tempMergeArray[i++];
            }
            else
                array[k++] = tempMergeArray[j++];
        }

        while (i <= mid){
            array[k++] = tempMergeArray[i++];
        }
    }

}
