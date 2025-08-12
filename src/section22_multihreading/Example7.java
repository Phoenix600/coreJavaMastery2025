package section22_multihreading;

class EvenThread extends Thread
{
    @Override
    public void run() {
        int i = 1;
        while (i <= 19) {
            try {
                Thread.sleep(500);
                if (i % 2 == 0) {
                    System.out.println("Even : " + i);
                }
                i++;
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }

        }
    }
}

class OddThread extends Thread
{
    @Override
    public void run() {
        int i = 1;
        while (i <= 19) {
            try {
                Thread.sleep(500);
                if (i % 2 != 0) {
                    System.out.println("Odd : " + i);
                }
                i++;
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }

        }
    }
}


public class Example7 {
    public static void main(String[] args)
    {
        EvenThread thread1 = new EvenThread();
        OddThread thread2 = new OddThread();

        thread1.start();
        thread2.start();
    }
}

