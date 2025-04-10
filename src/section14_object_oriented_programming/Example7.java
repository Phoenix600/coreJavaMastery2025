package section14_object_oriented_programming;

/**
 * File Name: Example7.java
 * Entity: Example7
 * Package: section14_object_oriented_programming
 * Author: pranayramteke
 * Date: 10/04/25
 * Description:
 */

class CylinderTest
{
	private float height;
	private float radius;
	
	public CylinderTest()
	{
		this.height = 10;
		this.radius = 5;
	}
	
	public CylinderTest(float height, float radius)
	{
		this.height = height;
		this.radius = radius;
	}
	
	public float volume()
	{
		return (float) Math.PI * radius * radius * height;
	}
	
	public float surfaceArea()
	{
		return 2 * (float) Math.PI * radius * radius + 2 * (float) Math.PI * radius * height;
	}
}

public class Example7
{
	public static void main(String[] args)
	{
		CylinderTest c1 = new CylinderTest();
		System.out.println("Volume : " + c1.volume());
		System.out.println("Surface Area : " + c1.surfaceArea());
		
		CylinderTest c2 = new CylinderTest(10,5);
		System.out.println("Volume : " + c2.volume());
		System.out.println("Surface Area : " + c2.surfaceArea());
		
	}
}
