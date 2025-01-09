package section17_interfaces_in_oop;

/**
 * Interfaces:
 *  1. What is an interface ?
 *  2. Multiple Inheritance Vs Interface
 *  3. Examples Of Interfaces
 *  4. Do's And Don't's Of Interfaces
 */

/*
 * 1. The purpose of Abstract class is to achieve inheritance and polymorphism.
 * 2. Abstract class can provide some features for inheritance and as well as it can be
 * used for polymorphism.
 * 3. Interface is completely used for achieving polymorphism, It doesn't have anything to
 * give to the subclasses.
 * 4. Reference of interface can hold the object of implementation class.
 * 5. In Java a class can extend only one class.
 * 6. In Java a class can implement more than one interfaces.
 * 7. Interface is an abstract class with full abstract methods.
 * 8. A class can not extends an interface. It should implement it.
 *
 * [Important]
 *  Methods are called based on the object attached to the reference variable.
 *  Interfaces are useful for achieving runtime polymorphism and for dynamic method dispatch.
 *  Interfaces are used for defining callback methods.
 */


interface MyInterface
{
    public abstract void method1();
    public abstract void method2();
}


class MyImplClass implements MyInterface
{
    public void method1()
    {
        System.out.println("Method-1 Called");
    }

    public void method2()
    {
        System.out.println("Method-2 Called");
    }

    public void method3()
    {
        System.out.println("Method-3 Called");
    }
}

public class Example1
{
    public static void main(String...args)
    {
//        You can not create the object of interface
//        MyInterface instance1 = new MyInterface();

        // Parent can hold the object of child
        // Parent = new Child()
        MyInterface instance = new MyImplClass();
        instance.method1();
        instance.method2();


    }
}
