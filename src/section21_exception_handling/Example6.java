package section21_exception_handling;

// Example Of Nested Try-Catch Blocks
public class Example6 {
    public static void main(String[] args) {

        try {
            int A[] = {10, 0, 8, 3, 5};

            try {
                int r = A[0] / A[1];
                System.out.println(r);
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
            }

        }catch (ArithmeticException exception)
        {
            System.out.println();
        }

    }
}
