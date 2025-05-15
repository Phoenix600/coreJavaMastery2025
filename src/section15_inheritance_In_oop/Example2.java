package section15_inheritance_In_oop;

class Circle
{
    public float radius;

    public Circle()
    {
        System.out.println("Circle Constructor Called");
    }

    public double perimeter()
    {
        return 2 * Math.PI * this.radius;
    }

    public float area()
    {
        return (float) (Math.PI * this.radius * this.radius);
    }
}

class Cylinder extends Circle
{
    public float height;
    public Cylinder()
    {
        System.out.println("Cylinder Constructor Called");
    }

    @Override
    public float area()
    {
        return (float)(( 2* Math.PI * radius * height) + (2 * Math.PI *this.radius * this.radius));
    }

    public float volume()
    {
        return (float) (Math.PI * this.radius * this.radius * this.height);
    }
}

public class Example2 {
    public static void main(String[] args) {
//        Circle instance1 = new Circle();
        Cylinder instance2 = new Cylinder();
        instance2.radius = 10;
        instance2.height = 15;
        System.out.println(instance2.area());

    }
}
