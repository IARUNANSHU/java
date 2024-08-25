package String;

public class CompareString {

    public static void main(String[] args)
    {
        StringBuffer sb1 = new StringBuffer("11111");
        System.out.println(sb1.hashCode());
        StringBuffer sb2 = sb1.append(22222).reverse();
        System.out.println(sb1.hashCode());

        System.out.println(sb2.hashCode());

        System.out.println(sb1 == sb2);
    }
}
