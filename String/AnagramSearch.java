package String;

import java.util.ArrayList;
import java.util.List;

public class AnagramSearch {
    public static void main(String[] args) {
        String s1 = "cbaebabacd";
        String s2 = "abc";
        System.out.println(anagram(s1, s2));
    }

    public static List<Integer> anagram(String s1, String s2) {
        List<Integer> list = new ArrayList<>();

        int s2_length = s2.length();
        List<String> lists = new ArrayList<>();
        for (int i = 0; i <= s1.length() - s2_length; i++) {
            lists.add(s1.substring(i, i + s2_length));
        }
        for(int i=0; i<lists.size();i++){
            if(checkAnagram(lists.get(i), s2))
                list.add(i);
        }
        System.out.println(lists);
        return list;

    }

    public static boolean checkAnagram(String s1, String s2){
        int[] arr = new int[256];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        for(int i=0;i<256; i++){
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}
