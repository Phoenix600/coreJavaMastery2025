package section13_methods;

/**
 * File Name: Example1.java
 * Entity: Example1
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 01/04/25
 * Description: Example-1 Functions In Java
 * This block of code teaches you about the static functions
 * and non-static functions.
 */

public class Example1
{
	// static methods can be accessed from static context only
	static int max(int x, int y)
	{
		if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	int min(int x, int y)
	{
		if(x < y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	void modifyPrimitives(int x)
	{
		System.out.println("Function: " + x);
		x++;
		System.out.println("Function : " + x);
		return;
	}
	
	// static method can call static methods only
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;
		
		int c = max(a,b);
		System.out.println("Max : " + c);
		
		Example1 instance = new Example1();
		c = instance.min(a,b);
		
		System.out.println("Min : " + c);
		
		// When passing primitive variables as parameters to
		// the method, their value is copied to formal parameters
		instance.modifyPrimitives(a);
		
		System.out.println("Main : " + a);
		
		
	}
}
