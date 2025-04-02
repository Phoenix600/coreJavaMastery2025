package section13_methods;

/**
 * File Name: Example7.java
 * Entity: Example7
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 01/04/25
 * Description: Method Overloading
 */

public class Example7
{
	static int max(int x, int y)
	{
		return Math.max(x, y);
	}
	
	static float max(float x, float y)
	{
		return Math.max(x,y);
	}
	
	static int max(int x,int y, int z)
	{
		return Math.max(Math.max(x,y),z);
	}
	
	public static void main(String[] args) {
		int a1 = 12;
		int a2 = 13;
		
		int lnMax = max(a1,a2);
		System.out.println("Maximum Element : " + lnMax);
		
		int n1 = 1002;
		int n2 = 102;
		int n3 = 1212;
		
		lnMax = max(n1,n2,n3);
		System.out.println("Maximum Number Out Of Three Numbers : " + lnMax);
		
		float f1 = 12.12f;
		float f2 = 0.456f;
		float lfMax = max(f1,f2);
		System.out.println("Maximum Float Number : " + lfMax);
		
	}
}
