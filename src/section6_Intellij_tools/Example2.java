package section6_Intellij_tools;

public class Example2 {

    public static int foo(int a, int b)
    {
        return  a + b + 5;
    }

    public static void sayHello()
    {
        for(int i=0; i<10; i++)
        {
            System.out.println("Hello");
        }

        System.out.println("Bye");
    }


    public static void main(String[] args) {

        System.out.println("Statement-1");
        System.out.println("Statement-2");
        int sum = foo(12,13);
        sayHello();
        System.out.println("Statement-3");
        System.out.println("Statement-4");

    }
}
