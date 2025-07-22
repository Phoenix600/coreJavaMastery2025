package section20_packages_and_access_modifiers.pack1;

public class MyPack1Parent
{
    private int x1 = 1;
    protected int x2 = 10;
    int x3 = 100;
    public int x4 = 1000;

    private void method1()
    {
        System.out.println("Method-1");
    }

    protected void method2()
    {
        System.out.println("Method-2");
    }

    void method3()
    {
        System.out.println("Method-3");
    }

    public void method4()
    {
        System.out.println("Method-4");
    }

}
