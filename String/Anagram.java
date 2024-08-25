package String;

import java.util.Arrays;

public class Anagram {
    static final int CHAR=256;
    public static void main(String[] args) {
        String str1="Arunanshu";
        String str2="ruAnanush";

        System.out.println(checkAnagram(str1,str2));
        System.out.println(checkAnagram1(str1,str2));
    }
    public static boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        char[] s1=str1.toCharArray();
        Arrays.sort(s1);
        char[] s2=str2.toCharArray();
        Arrays.sort(s2);
        for (int i = 0; i < str1.length(); i++) {
            if (s1[i]!=s2[i])
                return false;
        }
        return true;
    }
    public static boolean checkAnagram1(String str1,String str2){
        int[] count=new int[CHAR];
        if (str1.length()!=str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;

        }
        for (int i = 0; i < str1.length(); i++) {
            if (count[i]!=0)
                return false;
        }
        return true;

    }
}
