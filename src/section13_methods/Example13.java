package section13_methods;

/**
 * File Name: Example13.java
 * Entity: Example13
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 03/04/25
 * Description:
 */

public class Example13
{
	public static int sum(int...nums)
	{
		int s = 0;
		for (int target : nums)
		{
			s = s + target;
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		int s = sum(1,2,3,4,5,6,7,87,8,9,10);
		System.out.println("Sum : " + s);
	}
}
