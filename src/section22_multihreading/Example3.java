package section22_multihreading;

// Example On Multi-Threading With Thread Class
class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        int i = 1;

        while(true)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class Example3
{
    public static void main(String[] args)
    {
        MyThread1 thread1 = new MyThread1();
        thread1.start();

        int i = 1;
        while (true)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
