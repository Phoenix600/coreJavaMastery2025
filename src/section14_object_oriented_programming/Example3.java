package section14_object_oriented_programming;

class Cylinder
{
    public float radius;
    public float height;

    public float lidArea()
    {
        return (float) Math.PI * radius * radius;
    }

    public float perimeter()
    {
        return  2 * (float) Math.PI * radius;
    }

    public float totalSurfaceArea()
    {
        return 2 * lidArea() + perimeter()* height;
    }

    public float volume()
    {
        return lidArea()*height;
    }

}

public class Example3 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;

        System.out.println("Lid Area : " + c1.lidArea());
        System.out.println("Total Surface Area : " + c1.totalSurfaceArea());
        System.out.println("Volume : " + c1.volume());
    }
}
