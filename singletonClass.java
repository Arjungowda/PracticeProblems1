/**
 * Created by mandy on 2/21/2016.
 */
public class singletonClass {
    private static singletonClass myObj;

    static{
        myObj = new singletonClass();
    }

    private singletonClass(){

    }

    public static singletonClass getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]){
        singletonClass ms = getInstance();
        ms.testMe();
    }
    //- See more at: http://www.java2novice.com/java-interview-programs/java-singleton/#sthash.CNbu1vQh.dpuf
}
