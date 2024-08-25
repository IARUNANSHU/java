package String;

public class PatternSearching {
    public static void main(String[] args) {
        String s1="Epam is Elegant";
        String s2="Elegant";
        pattern(s1,s2);
    }
    public static void pattern(String s1,String s2){
        for (int i = 0; i < s1.length()-s2.length();i++) {
            int k;
            for (k = 0; k < s2.length(); k++) {
                if (s1.charAt(i+k)!=s2.charAt(k)){
                    break;
                }
            }
//            if (k==0)
//                i++;
            if(k==s2.length())
                System.out.println("found at "+ i);

        }
    }
}
