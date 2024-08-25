package String;

public class SpecialCharacter {
    public static void main(String[] args) {
        String s1="*ac#b*x";
        char[] c1=s1.toCharArray();
        reverse(c1);
    }
    static void reverse(char[] c1){
        int i=0;
        int j=c1.length-1;
        while (i<j){
            if (c1[i]<97||c1[i]>122)
                i++;

//            if(c1[j]<97||c1[j]>122)
            if(!Character.isLetter(c1[j]) || !Character.isLetter(c1[j]))
                j--;
            if(c1[i]>97&&c1[i]<122 && c1[j]>97||c1[j]<122){
                char temp=c1[i];
                c1[i]=c1[j];
                c1[j]=temp;

                i++;
                j--;
            }
        }
        for (int k = 0; k < c1.length; k++) {
            System.out.print(c1[k]);
        }
    }
}
