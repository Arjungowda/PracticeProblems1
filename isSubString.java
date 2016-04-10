/**
 * Created by mandy on 1/16/2016.
 */
public class isSubString {
    public static void main(String[] args){
        String str1 = "waterbottle";
        String str2 = "water";
        boolean flag = isRotated(str1,str2);
        System.out.println(flag);
    }
    public static boolean isRotated(String s1, String s2){
        int len = s1.length();
        if(len == s1.length() && len>0){
            String s1s1 = s1+s1;
            return isSubstring(s1s1,s2);
        }
        return false;
    }

    public static boolean isSubstring(String s1s1, String s2){
        if(s1s1.toLowerCase().contains(s2.toLowerCase())){
            return true;
        }
        return false;
    }

}
