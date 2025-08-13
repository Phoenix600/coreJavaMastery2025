package section22_multihreading;

class Vehicle
{
    public int accelerate()
    {
        return 35;
    }

    public int brake()
    {
        return 25;
    }
}

class Ferrari extends Vehicle implements Runnable
{

    @Override
    public void run()
    {
        int i = 1;
        System.out.println("Ferrari Started....");
        while(i<=5)
        {
            try
            {
                System.out.println("Ferrari Speed: " + this.accelerate());
                System.out.println("Ferrari Brake Speed : " + (this.accelerate() - this.brake()));
                Thread.sleep(1000);
                i++;
            }catch (InterruptedException exception)
            {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("Ferrari Reached Finished Line....");
    }

    @Override
    public int accelerate() {
        return 242;
    }

    @Override
    public int brake() {
        return 100;
    }
}

class BMW extends Vehicle implements Runnable
{
    @Override
    public void run()
    {
        int i = 1;
        System.out.println("BMW Started....");
        while(i<=7)
        {
            try
            {
                System.out.println("BMW Speed: " + this.accelerate());
                System.out.println("BMW Brake Speed : " + (this.accelerate() - this.brake()));
                Thread.sleep(1000);
                i++;
            }catch (InterruptedException exception)
            {
                System.out.println(exception.getMessage());
            }
        }

        System.out.println("BMW Reached Finished Line....");
    }

    @Override
    public int accelerate() {
        return 250;
    }

    @Override
    public int brake() {
        return 90;
    }
}

// Race Example
public class Example8
{
    public static void main(String[] args) {
        Runnable ferrariRunnable = new Ferrari();
        Runnable bmwRunnable     = new BMW();

        Thread ferrariThread = new Thread(ferrariRunnable);
        Thread bmwThread     = new Thread(bmwRunnable);

        ferrariThread.start();
        bmwThread.start();
    }
}
