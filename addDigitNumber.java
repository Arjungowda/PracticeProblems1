/**
 * Created by mandy on 2/22/2016.
 */
public class addDigitNumber {
    public static void main(String[] args){
        int num = 94;
        int res = addDigit(num);
        System.out.print(res);
    }
    public static int addDigit(int num){
        int s = 0;
        if(num<=9)return num;
        while(num>=0){
            s += num%10;
            num=num/10;
            if(num<=0)
                if(s<=9)
                    return s;
                else {
                    num = s;
                    s=0;
                }
        }
        return s;
    }
}
