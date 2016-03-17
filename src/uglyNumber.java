/**
 * Created by mandy on 2/24/2016.
 */
public class uglyNumber {

    public static void main(String[] args){
        boolean f = isUgly(300);
        if(f)
            System.out.print("ugly number");
        else System.out.print("NOT ugly number");
    }

    public static boolean isUgly(int num) {
        if(num == 1) return true;
        int n = num;
        //boolean flag = false;
        while((n%2==0 || n%3==0 || n%5==0 ) && n>0)
        {
            if(n%2==0)n = n/2;
            else if(n%3==0) n = n/3;
            else if(n%5==0) n = n/5;

            if(n==1){
                return true;
            }
        }

        return false;
    }
}
