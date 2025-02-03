package section21_exception_handling;

public class Example3 {
    public static void main(String[] args) {
        int a,b,c;

        a = 10;
        b = 0;

        // Contains Code Which May Produce Error
        try {
            c = a / b;
            System.out.println("Result : " + c);
        }
        catch (ArithmeticException exception) // Handling The Error Message
        {
            System.out.println("You're Dividing Number By Zero /");
            System.out.println(exception.getMessage());
        }

    }
}
