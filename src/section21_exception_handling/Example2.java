package section21_exception_handling;

public class Example2 {
    public static void main(String[] args) {

        int a,b,c;

        a = 5;
        b = 0;

        c = a/b;  // ⛔ Exception because of Bad Input
        // Program will print the error message and comes out of error occurring method.
        System.out.println(c);

        System.out.println("End Of Program");
        System.out.println("Bye");
    }
}
