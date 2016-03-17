/**
 * Created by mandy on 2/23/2016.
 */
public class reverseWordsinSentence {
    public static void main(String[] args)
    {
        String sentence = "Padma is arjun's mother";
        String reverseSentence = revWords(sentence);
        System.out.println(reverseSentence);
    }

    public static String revWords(String sentence){
        String[] words = sentence.split(" ");
        int len = words.length;
        StringBuilder sb = new StringBuilder();
        for(int i=len-1;i>=0;i--)
        {

            sb.append(revChars(words[i]) + " ");
        }
        return sb.toString();
    }

    public static String revChars(String word){
        String res = "";
        for(int j = word.length()-1;j>=0;j--)
            res+=word.charAt(j);
        return res;
    }
}
