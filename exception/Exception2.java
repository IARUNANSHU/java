package exception;

public class Exception2 {
    public static void main(String[] args) {
        int x=10;
        try{
            divisionbyzero(x);

        }
        catch (ArithmeticException e){
            System.out.println("division by zero not allowed");
        }
    }
    public static int divisionbyzero(int x)throws ArithmeticException{
        return x/0;
    }
}
