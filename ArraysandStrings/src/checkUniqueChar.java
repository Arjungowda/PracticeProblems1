import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by mandy on 2/17/2016.
 */
public class checkUniqueChar {
    public static void main(String[] args){
        String str = "arunn";
        boolean flag = checkifUnique(str);
        if(flag)
            System.out.println("Unique characters");
        else
            System.out.println("Repeated charecters");
        String revStr = reverseString(str);
        System.out.println(revStr);
        //String str2 = "fffff";
        boolean permutationFlag = isPermutation(str,revStr);
        if(permutationFlag)
            System.out.println("Is a permutation");
        else
            System.out.println("Is NOT a permutation");
        String strr = "This is the Man";
        char[] content = strr.toCharArray();
        strr = strr.replace(" ", "%20");
        System.out.println(strr);
        String sttr = "aabbbcbggg";
        stringCompression(sttr);
    }

    public static void stringCompression(String str){
        StringBuilder sb = new StringBuilder();
        if(str.length() == 0) return;
        int count = 1;
        for(int i = 0 ; i < str.length()-1 ; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
            if(str.charAt(i) == str.charAt(i+1))
                count++;
            if(i == str.length()-2){
                sb.append(str.charAt(i));
                sb.append(count);
            }


        }
        System.out.println(sb);
    }

    public static boolean isPermutation(String s1, String s2){
        if(s1.length() != s2.length())
          return false;
      //return sort(s1).equals(sort(s2));
        int[] letters = new int[256];
        char[] content = s1.toCharArray();
        for(char c:content)
            letters[c]++;
        for(int i=0 ; i<s2.length()-1 ; i++){
            int c = (int)s2.charAt(i);
            if(-- letters[c] < 0) return false;
        }
        return true;
    }
    public static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean checkifUnique(String s){
        HashSet<Character> map = new HashSet<Character>();
        int c = s.length();
        int i = 0;
        while(c-- > 0){
            if(map.contains(s.charAt(i)))
                return false;
            else{
                map.add(s.charAt(i));
                i++;
            }
        }
        return true;
    }
    public static String reverseString(String str){
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = len-1; i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

}
