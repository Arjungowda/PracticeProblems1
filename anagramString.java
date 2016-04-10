import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mandy on 3/17/2016.
 */
public class anagramString {
    public static void main(String[] args)
    {
        String s = "anagram";
        String t = "nagaram";
        Boolean f = checkForAnagram(s,t);
        if(f)
            System.out.print("True");
        else
            System.out.print("False");
    }
    public static Boolean checkForAnagram(String s, String t)
    {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
            {

                map.put(t.charAt(i), map.get(t.charAt(i))-1);

            }

            else{
                return false;
            }
        }
        Iterator it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry te = (Map.Entry)it.next();
            if((int)te.getValue()>0)
                return false;
        }
        return true;
    }
}
