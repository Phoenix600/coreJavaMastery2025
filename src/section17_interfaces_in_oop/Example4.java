package section17_interfaces_in_oop;

/**
 *  ================================================================================
 *  Do's And Don't's Of Interface
 *  ================================================================================
 *  1. All methods in interface are public abstract/
 *  2. Interface can have identifiers and these identifiers are static and final
 *  means they are constant.
 *  3. Interface can have static concrete methods.
 *  4. Interface can extend another interface
 *  5. default methods are allowed
 *  6. From Java 9 onwards Interface can have private concrete methods. which will be internally
 *  used by default methods.
 *  [Important]
 *  To update and modify existing interfaces without disturbing existing classes
 *  we can make use of default method.
 */
interface IMyInterface
{
    /// constant value
    final static Integer VERSION = 12;

    /// public abstract methods
    public abstract void method1();
    void method2();

    /// static method in interface
    public static void method3()
    {
        System.out.println("Static method of interface");
    }

    ///  from java version 8 onwards you can declare default method
    ///  this method is by default public.
    default void method4()
    {
        System.out.println("Default Method in IMyInterface");
        method5(); // default method can access private concrete methods.
    }

    private void method5()
    {
        System.out.println("Methods5 in IMyInterface");
    }

}

interface IChildInterface extends IMyInterface
{
    void method6();
}

class MyInterfaceImpl implements IChildInterface
{

    @Override
    public void method6() {
        System.out.println("Method5 of MyInterfaceImpl");
    }

    @Override
    public void method1() {
        System.out.println("Method1 of MyInterfaceImpl");
    }

    @Override
    public void method2() {
        System.out.println("Method2 of MyInterfaceImpl");
    }
}

public class Example4 {

    public static void main(String[] args)
    {
        System.out.println( "Interface Version : " + IMyInterface.VERSION);
        IMyInterface.method3();

    }
}
