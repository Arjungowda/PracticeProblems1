import java.util.ArrayList;

/**
 * Created by mandy on 2/20/2016.
 */
public class stringPermutation {
    String str = "abcd"; //our string
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

    public static void main(String []args){
        stringPermutation ps = new stringPermutation();
        for(int i = 0; i< ps.str.length();i++){ //traverse through all characters
            ps.subs("",i);
        }
    }

    void subs(String substr,int index)
    {
        String s = ""+str.charAt(index); //very important, create a variable on each stack
        s = substr+s; //append the subset so far
        System.out.println(s); //print

        for(int i=index+1;i<str.length();i++)
            subs(s,i); //call recursively
    }
}
