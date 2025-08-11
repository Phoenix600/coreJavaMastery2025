package section22_multihreading;

// Example On Multi-Threading With Thread Class
public class Example4 extends Thread
{
    @Override
    public void run() {

        int i = 1;

        while (true)
        {
            System.out.println( i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {

        Example4 instance = new Example4();
        instance.start();

        int i = 0;

        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
