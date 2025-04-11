package section14_object_oriented_programming;

/**
 * Usually the data is hidden and operations are made visible.
 * Methods are performed over data only.
 *
 *   default
 *   public       : can be accessed outside of package
 *   protected    :
 *   private      : can be not accessed outside the class
 */
class MyRectangle
{
    private int length;
    private int breadth;

    ///  Getters And Setters
    // Reading the value
    public int getLength() {
        return length;
    }

    // Writing the value
    public void setLength(int l)
    {
        if(l > 0)
            length  = l;
        else
            length = 0;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int b)
    {
        if(b > 0)
        {
            breadth = b;
        }
        else
        {
            breadth = 0;
        }
    }

    //  end of getters and setters

    // normal methods
    public int area()
    {
        return  length * breadth;
    }

    public int perimeter()
    {
        return  2 * (length + breadth);
    }


}

public class Example5 {
    public static void main(String[] args) {
        MyRectangle rectangle = new MyRectangle();

        rectangle.setBreadth(10);
        rectangle.setLength(20);

        System.out.println("Area : " + rectangle.area());
        System.out.println("Perimeter : " + rectangle.perimeter());
	    
	    System.out.println("Length : " + rectangle.getLength());
	    System.out.println("Breadth : " + rectangle.getBreadth());
		
    }
}
