package section22_multihreading;

public class Example6 implements Runnable
{
    @Override
    public void run() {
        int i = 1;
        while (true)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args)
    {
        Example6 runnableInstance =  new Example6();
        Thread threadInstance     =  new Thread(runnableInstance);

        threadInstance.start();

        int i = 1;
        while (true)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
