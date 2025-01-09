package section14_object_oriented_programming;

// Assignment-2
class Rectangle
{
    public int length;
    public int breadth;

    public int area()
    {
        return length * breadth;
    }

    public int perimeter()
    {
        return 2 * (length + breadth);
    }

    public boolean isSquare()
    {
        if(length == breadth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Example2 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        System.out.println("Length  : " + r1.length);
        System.out.println("Breadth : " + r1.breadth);
        System.out.println("Area : " + r1.area());
        System.out.println("Area : " + r1.perimeter());

        r1.length = 10;
        r1.breadth = 14;

        System.out.println("Area : " + r1.area());
        System.out.println("Perimeter : " + r1.perimeter());
        System.out.println("Is Square : " + r1.isSquare());

    }
}
