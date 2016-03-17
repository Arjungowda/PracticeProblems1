import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by mandy on 3/5/2016.
 */
public class longestUniqueCharsInString {

    public static void main(String[] args)
    {
        String s = "dvdddr";
        int n = lengthOfLongestSubstring(s,2);
        System.out.print((n));
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        HashMap<Character,Integer> set = new HashMap<Character,Integer>();
        int len =0, maxLen = 0;
        for(int i=0;i<s.length();i++)
        {
            if(set.containsKey(s.charAt(i))){
                if(maxLen<len) maxLen = len;
                len = 0;
                i = set.get(s.charAt(i));
                set.clear();
            }
            else
            {
                set.put(s.charAt(i),i);
                len++;
            }
        }
        if(len>maxLen) return len;
        return maxLen;
    }

    //Follow up => Longest unique character subsequence with atmost 2 same characters
    public static int lengthOfLongestSubstring(String s, int k) {
        if(s.length()==0)
            return 0;

        HashMap<Character,Integer> set = new HashMap<Character,Integer>();
        int len =0, maxLen = 0;
        for(int i=0;i<s.length();i++)
        {
            if(set.containsKey(s.charAt(i)) && k<=0){
                k--;
                if(maxLen<len) maxLen = len;
                len = 0;
                i = set.get(s.charAt(i));
                set.clear();
            }
            else
            {
                set.put(s.charAt(i),i);
                len++;
            }
        }
        if(len>maxLen) return len;
        return maxLen;
    }


}
