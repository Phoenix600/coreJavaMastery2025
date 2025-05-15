package section26_generic_classes;

/**
 * By Default all classes inherit their properties from Object Class.
 * Parent Can Hold The Object Of Child
 * Object instance1 = new String("Data");
 * Object instance2 = new int[5];
 * Object instance3 = new Scanner(System.in);
 * Scanner instance4 = (Scanner)instance3;
 * ===================================================================================
 * We can also achieve generalization using Object Class.
 * [Important]
 * 1. If you have the reference of object class then you can assign it the object of any type or any class.
 * 2. When you want to get the actual object, you have do the type-casting.
 * 3. TypeConversion may lead to runtime error, type conversion is not checked at compile time.
 * While working with Object class for generalization there is no type safety.
 */

public class Example1 {
    public static void main(String[] args) {

        // Before Version 5
        Object instance1 = new String("Sample Data");
        System.out.println(instance1);

        System.out.println("After Type Conversion To String");
        String instance2 = (String) instance1;
        System.out.println(instance2);

        instance1 = 1212;
        System.out.println(instance1);
        System.out.println("After Type Conversion To Integer");
        Integer instance3 = (Integer) instance1;
        System.out.println(instance2);

        instance1 = new int[]{1,2,3,4,5};
        System.out.println(instance1);
        System.out.println("After Type Conversion To Integer");
        Integer instance4 = (Integer) instance1;
    }
}
