/**
 * Created by mandy on 2/22/2016.
 */
public class longestSequenceStreak {
    public static void main(String[] args){
        int [] arr = {1,1,0,0,1,1,1,0,1,1};
        int k = 2;
        int count = findLongestSequence(arr,k);
        System.out.print(count);
    }
    private static int findLongestSequence(int [] array, int k) {
        // TODO Auto-generated method stub
        int maxLength = 0, tempLength = 0, currentIndex = 0, tempFlips = k;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 && tempFlips >= 0) {
                tempLength++;
                if (i == (array.length - 1) && maxLength < tempLength) {
                    maxLength = tempLength;
                }
            } else {
                if (tempFlips == 0) {
                    currentIndex++;

                    tempFlips = k;
                    if (maxLength < tempLength) {
                        maxLength = tempLength;
                    }
                    tempLength = 0;
                    tempFlips = k;
                    i = currentIndex;
                } else {
                    tempFlips--;
                    tempLength++;
                }
            }
        }
        return maxLength;
    }
}


