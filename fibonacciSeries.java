import java.util.TreeMap;

/**
 * Created by mandy on 2/21/2016.
 */
public class fibonacciSeries {
    public static void main(String a[]){
        TreeMap<String ,String > map;
        int febCount = 15;
        int[] feb = new int[febCount];
        feb[0] = 0;
        feb[1] = 1;
        System.out.print(feb[0] +" "+feb[1]+ " ");

        for(int i=2; i< febCount; i++){
            System.out.print(feb[i-1] + feb[i-2] + " ");
            feb[i] = feb[i-1] + feb[i-2];
        }
    }
    //- See more at: http://www.java2novice.com/java-interview-programs/fibonacci-series/#sthash.bh6MJ10e.dpuf
}
