package String;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s1="Jaydeep is a Dog";
        rev(s1);
    }
    public static void rev(String s1){
        String[] s=s1.split(" ");
        int i=0;
        int j=s.length-1;
        while (i<j){
            String temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < s.length; k++) {
            System.out.print(s[k]+ " ");
        }
    }
}
