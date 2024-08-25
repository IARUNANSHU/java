package String;

import java.util.Stack;

public class ValidBracket {
    public static void main(String[] args) {
        String str="(()]))";
        System.out.println(bracket(str));
    }
    public static boolean bracket(String s){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='[')
                st.push(s.charAt(i));
            if (s.charAt(i)==')')
                if(st.peek()=='(')
                    st.pop();
                else return false;
            if (s.charAt(i)==']')
                if(st.peek()=='[')
                    st.pop();
                else return false;
        }
        return true;
    }
}
