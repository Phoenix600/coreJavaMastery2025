package section16_abstract_class_in_oop;

// student challenge

abstract class ShapeAbstractClass
{
    ShapeAbstractClass()
    {
        System.out.println("ShapeAbstractClass Constructor Called");
    }
    public abstract double area();
    public abstract double perimeter();
}

class CircleClass extends ShapeAbstractClass
{

    private int radius;

    public CircleClass(int radius)
    {
        super();
        this.radius = radius;
        System.out.println("CircleClass Constructor Called");
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

}

class RectangleClass extends ShapeAbstractClass
{

    private int length;
    private int breadth;

    public RectangleClass(int length, int breadth)
    {
        super();
        this.length = length;
        this.breadth = breadth;
        System.out.println("RectangleClass Constructor Called");
    }

    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }

}

public class Example5 {
    public static void main(String[] args) {

    }
}
