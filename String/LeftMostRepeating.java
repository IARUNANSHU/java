package String;

public class LeftMostRepeating {
    static final int CHAR = 256;

    public static void main(String[] args) {
        String s1 = "jaydeep";
        if(repeating(s1) == 0)
            System.out.println("no repeatative char found");
        else
            System.out.println(" Repeatative char: " + repeating(s1));

    }

    static char repeating(String s1) {
        char[] s = new char[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            s[s1.charAt(i)]++;
            if (s[s1.charAt(i)] > 1)
                return s1.charAt(i);
        }
        return 0;
    }
}
