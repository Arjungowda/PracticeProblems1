/**
 * Created by mandy on 3/7/2016.
 */
public class StringinArrayofStrings {
    public static void main(String[] args){
        String str = "banana";
        String[] strArray = {"real","argument","baaany","hanana","apple"};
        boolean f = isContainWithOneDifference(str,strArray);
        System.out.print(f);
    }

    static boolean isContainWithOneDifference(String str, String[] strArr)
    {
           for(int i=0;i<strArr.length;i++)
           {
               boolean f = check(str,strArr[i]);
               if(f)return true;
           }
        return false;
    }

    static boolean check(String s1,String s2){
        int count = 0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
                if(++count>=2) return false;
        }
        return true;
    }
}
