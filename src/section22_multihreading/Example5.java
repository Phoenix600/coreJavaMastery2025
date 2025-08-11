package section22_multihreading;


// Example On Multi-Threading With Runnable Interface
class MyRunnable implements Runnable
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
}

public class Example5
{
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();

        Thread threadInstance = new Thread(runnable);
        threadInstance.start();

        int i = 1;

        while (true)
        {
            System.out.println( i + " World");
            i++;
        }
    }
}
