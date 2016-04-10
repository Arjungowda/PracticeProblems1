import java.util.HashMap;

/**
 * Created by mandy on 1/25/2016.
 */
public class stringIsomorphic {

    public static void main(String[] args){
        boolean flag = isIsomorphic("ab","aa");
        if(flag)
            System.out.print("true");
        else
            System.out.print("false");
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0;i<=s.length()-1;i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(t.charAt(i) != map.get(c))
                    return false;
            }
            else{
                map.put(c,t.charAt(i));
            }
        }
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch = t.charAt(i);
            if(map2.containsKey(ch)){
                if(s.charAt(i) != map2.get(ch))
                    return false;
            }
            else{
                map2.put(ch,s.charAt(i));
            }
        }
        return true;
    }
}
