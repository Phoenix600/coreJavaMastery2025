package section13_methods;

/**
 * File Name: Example8.java
 * Entity: Example8
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 03/04/25
 * Description: Student Challenge
 * Write overloaded method area() for rectangle and circle
 */

public class Example8
{
	static float area(float radius)
	{
		return (float) Math.PI * radius * radius;
	}
	
	static int area(int length, int breadth)
	{
		return length * breadth;
	}
	
	public static void main(String[] args)
	{
		float area1 = area(10.0f);
		System.out.println("Area Of Circle : " + area1);
		
		int area2 = area(10,32);
		System.out.println("Area Of Rectangle : " + area2);
	}
}
