/**
 * Created by mandy on 2/5/2016.
 */
public class fizzBizz {

    public static void main(String[] args){
        int v1 = 3, v2 = 5;
        for(int i=1;i<100;i++){
            if((i%v1 == 0) && (i%v2 == 0))
                System.out.println("FizzBuzz");
            else if(i%v1 == 0){
                System.out.println("Fizz");
            }
            else if(i%v2 == 0){
                System.out.println("Buzz");
            }
            else System.out.println(i);
        }
    }
}
