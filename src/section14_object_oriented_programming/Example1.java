package section14_object_oriented_programming;

/**
 * Instructions For You :
 * ⭐ Remember:
 *  OOP Principles:
 *      1. Abstraction
 *      2. Encapsulation
 *      3. Inheritance
 *      4. Polymorphism
 *   These principles are common over all modern OOP languages
 *   Abstraction: Hiding internal details and showing only required features.
 *   Encapsulation: Grouping all features in a single body.
 *   Inheritance: Borrowing features from previously existing entity and adding some extra features to it. Used for reusing of code.
 *   Polymorphism: Entities which are having similar properties, can be grouped and with single reference.
 *   Specialization = Inheritance
 *   Generalization = Polymorphism
 *   Specialization is inheritance
 *   Generalization is polymorphism
 */


class Circle
{
    // data members
    public double radius;

    // member functions
    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        circle.radius = 10;
        System.out.println("Area      : " + circle.area());
        System.out.println("Perimeter : " + circle.perimeter());

        Circle circle1 = new Circle();

        circle1.radius = 14;
        System.out.println("Area      : " + circle1.area());
        System.out.println("Perimeter : " + circle1.perimeter());


    }
}
