package String;

public class SubSequence {
    public static void main(String[] args){
        String str1="jaideep";
        String str2="jaideep";
        System.out.println(sequence(str1,str2));
    }
    public static boolean sequence(String str1,String str2){
        int k=0;
        for(int i=0;i<str1.length()&&k<str2.length();i++){
            if(str1.charAt(i)==str2.charAt(k))
                k++;
        }
        return k==str2.length();
    }
}
