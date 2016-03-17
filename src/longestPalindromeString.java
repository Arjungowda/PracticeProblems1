import java.util.HashMap;
import java.util.List;

/**
 * Created by mandy on 1/24/2016.
 */
public class longestPalindromeString {

    public  static void main(String[] args){
        //String s = longestPalindrome("abb");
        //System.out.print(s);

        /*char c = mostOccuringChar("abb");
        System.out.println(c);
*/
        /*String resString = removeDuplicates("abb");
        System.out.println(resString);*/

        /*if(checkIfNumber("+.3"))
            System.out.println("Is a number");
        else
            System.out.println("Is not a number");*/

        double val = convertStringtoNumber("-1234");
        System.out.println(val);
    }

    public static double convertStringtoNumber(String s){
        char[] charArray = s.toCharArray();
        int count = 1;
        int len = s.length()-1;
        double res = 0;
        while(len>0)
        {
            res += (charArray[len]-48)*count;
            count = count*10;
            len--;
        }
        if(len == 0 && charArray[len]=='-')
            res = -res;
        else if (len == 0 && charArray[len]=='+')
            res = res;
        else res += (charArray[len]-48)*count;
        return res;
    }

     public static boolean checkIfNumber(String s){
         char[] chArray = s.toCharArray();
         int flag = 0;
         if(((int)chArray[0]==46)) flag++;
         if(!((int)chArray[0]>57 || (int)chArray[0]<48 ||((int)chArray[0]!=45) || ((int)chArray[0]!=43)))
         {

             return false;
         }

         for(int i=1;i<s.length();i++){
             if(!((int)chArray[i]!=46)) flag++;
             if(flag>1)
                 return false;
             if((int)chArray[i]>57 || (int)chArray[i]<48)
                    return false;
         }
         return true;
     }

    public static String removeDuplicates(String s){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                sb.append(s.charAt(i));
            }
            else map.put(s.charAt(i),1);
        }
        return sb.toString();
    }

    public static char mostOccuringChar(String s){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char maxChar = ' ';
        int maxCount = 0;
        for(int i=0;i<s.length();i++)
            if(map.containsKey(s.charAt(i)))
            {
                if(maxCount<=map.get(s.charAt(i))) {
                    maxCount = map.get(s.charAt(i));
                    maxChar = s.charAt(i);
                }

            }
            else
                map.put(s.charAt(i),1);
        return maxChar;
    }

    public static String longestPalindrome(String s) {
        int len = 0,index = 0;

        for(int j=0;j<s.length();j++){
            if(isPalindrome(s,j-len,j))
            {
                len+=1;
                index =j;
            }
            if(j-len-1>=0 && isPalindrome(s,j-len-1,j)){
                len = len + 2;
                index = j;
            }
        }
        return s.substring(index-len+1,index+1);
    }

    public static boolean isPalindrome(String s,int i, int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    /*public static String longestPalindrome(String s) {
        if(s.length() == 0 || s == null)
            return "";
        int len = s.length();
        boolean[][] str = new boolean[len][len];
        boolean flag = false;
        int start = 0, end = 0, max =0;

        for(int i=0; i<s.length();i++)
            for(int j=0;j<i;j++){
                if(s.charAt(j) == s.charAt(i) && (i-j <= 2 || str[j+1][i-1])){
                    str[j][i] = true;
                }
                if(str[j][i] && max < i-j+1){
                    max = i-j+1;
                    start = j;
                    end = i;
                }
            }
        return s.substring(start,end+1);
    }
*/
}
