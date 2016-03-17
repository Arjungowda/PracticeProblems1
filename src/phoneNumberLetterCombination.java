import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mandy on 2/24/2016.
 */
public class phoneNumberLetterCombination {

    public static void main(String[] args) {
        String digits = "236";
        List<String> list = letterCombinations(digits);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() +" ");
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0 || digits == null)
            return new ArrayList<String>();

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "");
        map.put(1, "");
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        List<String> result = new ArrayList<String>();
        StringBuffer s = new StringBuffer();
        DFS(digits, result, s, 0, map);
        return result;
    }

    public static void DFS(String digits, List<String> result, StringBuffer s, int start,
                           HashMap<Integer, String> map) {
        if (start == digits.length())
            result.add(s.toString());
        else {
            String tmp = map.get(digits.charAt(start) - '0');
            for (int i = 0; i < tmp.length(); i++) {
                s.append(tmp.charAt(i));
                DFS(digits, result, s, start + 1, map);
                s.deleteCharAt(s.length() - 1);
            }
        }
    }
}
