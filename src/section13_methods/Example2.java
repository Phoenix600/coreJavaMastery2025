package section13_methods;

/**
 * File Name: Example2.java
 * Entity: Example2
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 01/04/25
 * Description: Understand how objects are passed to the method.
 *
 * There is only one method in Java, is parameter passing.
 * The content of actual parameter is copied in formal parameters.
 */

public class Example2
{
	static void update(int A[])
	{
		A[0] = 17;
	}
	
	static void change(int A[], int index, int value)
	{
		A[index] = value;
	}
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,5,6};
		
		for (int x : nums)
		{
			System.out.print(x + " ");
		}
		
		// Printing Extra New Line
		System.out.println();
		
		// Updating The value Original Array
		// When objects are passed as a parameter to the
		// method, it's reference (address) is passed.
		update(nums);
		
		for (int x : nums)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		
		
		change(nums,3,12);
		for (int x : nums)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		
	}
}
