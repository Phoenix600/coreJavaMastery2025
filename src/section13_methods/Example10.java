package section13_methods;

/**
 * File Name: Example10.java
 * Entity: Example10
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 03/04/25
 * Description: Variable Argument Methods In Java
 */

public class Example10 {
	

	 // ... means combine all arguments into array
	static void show(int...x)
	{
		for(int target : x)
		{
			System.out.println(target);
		}
	}
	
	// Variable argument should be the last parameter of a function
	static void show1(int x, int...y)
	{
		System.out.println("X : " + x);
		for (int target : y)
		{
			System.out.println(target);
		}
	}
	
	public static void main(String[] args) {
		
		show();
		show(10);
		show(10,20,30);
		show(10,20,30,40);
		show(10,20,30,40,50);
		show(10,20,30,40,50,60);
		show(new int[]{10,20,30,40,50,60,70});
		
		show1(12,13);
		show1(12,12,13,15);
		
	}
}
