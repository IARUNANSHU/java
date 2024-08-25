package exception;

public class JavaExceptionHandlingQuiz
{
    public static void main(String[] args)
    {
        try
        {
            NumberFormatException ex = new NumberFormatException();

            throw ex;
        }
        catch (NullPointerException ex)
        {
            System.out.println(1);
        }
    }
}