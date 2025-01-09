
    package section16_abstract_class_in_oop;

/**
 * ================================================================================
 *  1. What is an  abstract class
 *  2. Example of abstract class
 *  3. Why Abstract class
 *  4. Key Points
 *====================================================================================
 *  There are two types of classes:
 *      1. abstract class
 *      2. concrete class
 *   ==============================
 *   # Abstract Vs Concrete Class #
 *   =============================
 *      A. if a class is declared with abstract keyword then it is abstract class
 *      Abstract Vs Concrete Class
 *      1. You can not create the object of abstract class
 *      2. You can only create the object of concrete class
 *      3. Abstract class can be used as Reference variable.
 *      5. Concrete class can be used as Reference Variable.
 *      ================================================================================
 *      Abstract Method:
 *          Undefined method is known as abstract method.
 *          Implementation less method is called abstract method.
 *      =================================================================================
 *      Abstract Class:
 *          If a  class is having at least one abstract method then it is called abstract class
 *          It is a hollow class.
 *
 *          If Any class extends the abstract class, then that class also becomes the abstract class.
 *
 *          [IMPORTANT]
 *          If a class is inheriting from the abstract class, then it will also become abstract class.
 *          To become concrete class it must override all the abstract methods of parent class.
 *
 *          Abstract classes are only meant for inheritance.
 *
 *          [USAGE]
 *          Abstract classes are used for defining standards and imposing standards.
 */

abstract class MyAbstractClass
{
    public String data;

    public MyAbstractClass()
    {
        System.out.println("No Argument Constructor Of MyAbstractClass");
    }

    public void method1()
    {
        System.out.println("Method-1 of MyAbstractClass");
    }

    public abstract void method2();
}

class MyConcreteClass extends MyAbstractClass
{
    public MyConcreteClass()
    {
        super();
        System.out.println("MyConcreteClass Constructor Called");
    }

    @Override
    public void method2() {
        System.out.println("Method2 of MyConcreteClass");
    }
}

public class Example1 {
    public static void main(String[] args) {
        MyAbstractClass myAbstractObject = new MyConcreteClass();

        myAbstractObject.method2();
        myAbstractObject.method1();
    }
}
