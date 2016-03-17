/**
 * Created by mandy on 3/7/2016.
 */
public class checkIfSubstringSameSequenceInSentence {
    public static void main(String[] args) {
        String str = "aNjAhNgAhGAhRgbRevfh";
        String sub = "NAGARRO";
        Boolean flag = checkFunction(str,sub);
        System.out.print(flag);
    }

    static boolean checkFunction(String str, String sub)
    {
        if(sub.length()==0 || str.length()==0)
            return true;
        int i=0,j=0;
        while(i<str.length() && j<sub.length())
        {
            if(sub.charAt(j) == str.charAt(i))
            {
                j++;
                if(j==sub.length()) return true;
            }
            i++;
        }
        if(j==sub.length()) return true;
        return false;
    }

}
