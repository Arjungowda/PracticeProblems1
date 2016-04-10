/*
import sun.text.normalizer.Trie;

*
 * Created by mandy on 2/22/2016.


public class triePractice {

    char c;
    Trie[] children;
    boolean isWord ;

    public triePractice(){
        this.c = 0;
        this.children = new Trie[26];
        this.isWord = false;
    }

    public void add(String s){
        if(s.isEmpty()){
            this.isWord = true;
            return;
        }

        char letter = s.charAt(0);
        int index = letter - 'a'; // 'a' -> 97
        if(this.children[index] == null) {
            this.children[index] = new Trie();
        }
        this.children[index].add(s.substring(1));
    }

    public boolean isWord(String s){
        if(s.isEmpty()){
            return this.isWord;
        }
        char letter = s.charAt(0);
        int index = letter - 'a';
        if(this.children[index] ==null)
            return false;
        return this.children[index].isWord(s.substring(1));
    }
}
*/
