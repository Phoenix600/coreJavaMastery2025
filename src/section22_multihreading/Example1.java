package section22_multihreading;

// Order of execution of statements is known as flow of program.
// This flow is known as Single Control Flow that is executing the program
// This single control flow is known as single program or it is just a single thread.
// This is a main thread.
public class Example1
{
    static void display()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args)
    {
        display();
        System.out.println("World");
    }
}
