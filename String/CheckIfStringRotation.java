package String;

public class CheckIfStringRotation {
    public static void main(String[] args) {
        String s1="arunanshu";
        String s2="nanshuaru";
        rotation(s1,s2);

    }
    public static void rotation(String s1,String s2){
        System.out.println(s1.concat(s1).contains(s2));
    }
}
