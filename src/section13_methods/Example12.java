package section13_methods;

/**
 * File Name: Example12.java
 * Entity: Example12
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 03/04/25
 * Description: Student Challenge:
 * Find the maximum of numbers using variable argument method
 */

public class Example12
{
	static int max(int...nums)
	{
		if(nums.length == 0)
		{
			return Integer.MIN_VALUE;
		}
		
		int lnMax = nums[0];
		
		for (int i = 1; i < nums.length; i++)
		{
			if(nums[i] > lnMax)
			{
				lnMax = nums[i];
			}
		}
		
		return lnMax;
	}
	
	public static void main(String[] args)
	{
		int maxData = max(1,5,-10);
		maxData = max(10,20,30);
		maxData = max(10,20,30,40,50);
	}
}
