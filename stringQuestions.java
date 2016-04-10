import java.util.*;

/**
 * Created by mandy on 2/20/2016.
 */
public class stringQuestions {
    public static void main(String[] args){
        String str = "Hello Hello how are you how are are";
        // reverse only words in the sentence AND also remove redundtant words
        reverse(str); // Hello world -> olleh dlrow
        //most frequent 'k' words in the given string
        int k = 3;
        //topWords(str,k);
        //REVERSE COMPLETE SENTENCE
        //String rev = reverseString(str);
        //System.out.println(rev);
    }

    public static void topWords(String str,int k){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] s = str.split(" ");
        for(int i=0;i<s.length;i++)
            if(map.containsKey(s[i]))
                map.put(s[i],(map.get(s[i])+1));
            else
                map.put(s[i],1);
        List<Map.Entry<String,Integer>> resList = sortHashMapByValue(map);
        int count = 0;
        for(Map.Entry<String, Integer> entry:resList){
            if(count++ <= k)
                System.out.println(entry.getKey()+" ==== "+entry.getValue());
            else break;
        }
    }

    public static List<Map.Entry<String,Integer>> sortHashMapByValue(HashMap <String, Integer> map){
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        return list;

    }
    //reversing only words in the sentence
    public static void reverse(String str){
        String[] s = str.split(" ");
        String resstr = "";
        HashSet<String> set = new HashSet<String>();
        int flag = 0;
        for(int i=0;i<s.length-1;i++){
            if(!set.contains(s[i]))
            {
                set.add(s[i]);
                char[] ch = s[i].toCharArray();
                ch = rev(ch);
                resstr += String.valueOf(ch)+" ";
            }
            else
                flag=5;
        }
        if(!set.contains(s[s.length-1]))
            resstr += String.valueOf(rev(s[s.length-1].toCharArray()));
        System.out.print(resstr.toString());
    }
    public static char[]  rev(char[] ch){
        int j = 0;
        while(j<ch.length/2){
            char c = ch[j];
            ch[j] = ch[ch.length-j-1];
            ch[ch.length-j-1] = c;
            j++;
        }
        return ch;
    }


    static  String reverse = "";
    public static String reverseString(String str){

        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
    //- See more at: http://www.java2novice.com/java-interview-programs/string-reverse-recursive/#sthash.517FW5xC.dpuf

}
