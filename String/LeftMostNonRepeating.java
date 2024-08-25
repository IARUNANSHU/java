//package String;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class LeftMostNonRepeating {
//    static final int CHAR=256;
//    public static void main(String[] args) {
//        String s1="arunanshu";
//        System.out.println(nonrepeat(s1));
//    }
//    public static Character nonrepeat(String s1){
//        Map<Character, Integer> lh=new LinkedHashMap<>();
//        for (char c : s1.toCharArray()) {
//            lh.put(c, lh.getOrDefault(c, 0) + 1);
//        }
//        for (Map.Entry<Character, Integer> entry : lh.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//        return 0;
//    }
//    public static Character findLeftmostNonRepeatingChar(String str) {
//
//        int[] arr=new int[CHAR];
//
//        for (int i = 0; i < str.length(); i++) {
//
//        }
//    }
//
//}
