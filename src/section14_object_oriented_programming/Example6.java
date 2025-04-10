package section14_object_oriented_programming;

class RectangleTest
{
	private int length;
	private int breadth;
	
	public RectangleTest()
	{
		this.length = 10;
		this.breadth = 10;
	}
	
	public RectangleTest(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int l)
	{
		if(l > 0)
			length  = l;
		else
			length = 0;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int b) {
		if(b > 0)
		{
			breadth = b;
		}
		else
		{
			breadth = 0;
		}
	}
	public int area()
	{
		return  length * breadth;
	}
	public int perimeter()
	{
		return  2 * (length + breadth);
	}
}

public class Example6
{
	public static void main(String[] args) {
		RectangleTest r1 = new RectangleTest();
		
		System.out.println("Length  : " + r1.getLength());
		System.out.println("Breadth : " + r1.getBreadth());
		System.out.println("Area : " + r1.area());
		System.out.println("Perimeter : " + r1.perimeter());
		
		r1.setLength(10);
		r1.setBreadth(14);
		
		System.out.println("Area : " + r1.area());
		System.out.println("Perimeter : " + r1.perimeter());
		
		
		RectangleTest r2 = new RectangleTest(12,14);
		
		System.out.println("Area : " + r2.area());
		System.out.println("Perimeter : " + r2.perimeter());
		
	}
}
