package hashing;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterOfString {
    public static void main(String[] args) {
        String str="arunanshu";
        duplicate(str);
    }
    public static void duplicate(String str){
        Map<Character,Integer>mp=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
        }
        for (Map.Entry<Character,Integer>e: mp.entrySet()){
            if(e.getValue()>1)
                System.out.println(e.getKey());
        }

    }
}
