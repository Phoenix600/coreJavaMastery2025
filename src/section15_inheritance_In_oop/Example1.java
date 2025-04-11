package section15_inheritance_In_oop;

class Rectangle
{
	private int length;
	private int breadth;
	
	public Rectangle()
	{
		this.length = 10;
		this.breadth = 20;
	}
	
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getBreadth()
	{
		return breadth;
	}
	
	public void setLength(int l)
	{
		this.length = l;
	}
	
	public void setBreadth(int b)
	{
		this.breadth = b;
	}
	
	public int area()
	{
		return length * breadth;
	}
	
	public int perimeter()
	{
		return 2 * (length + breadth);
	}
	
}

class Cuboid extends Rectangle
{
	private int height;
	
	public Cuboid()
	{
		super();
		this.height = 10;
	}
	public Cuboid(int length, int breadth, int height)
	{
		super(length, breadth);
		this.height = height;
	}
	
	public int volume()
	{
		return getLength()  * getBreadth() * height;
	}
}


public class Example1 {
	public static void main(String[] args) {
		
		Cuboid c1 = new Cuboid();
		System.out.println("Volume : " + c1.volume());
		System.out.println("Area : " + c1.area());
		
		Cuboid c2 = new Cuboid(10,20,30);
		System.out.println("Volume : " + c2.volume());
		System.out.println("Area : " + c2.area());
	}
}
