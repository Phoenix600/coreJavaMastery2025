package section13_methods;

/**
 * File Name: Example6.java
 * Entity: Example6
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 01/04/25
 * Description:
 */
 
public class Example6
{
	static int max(int nums[])
	{
		int res = nums[0];
		
		for(int i = 1; i < nums.length; i++)
		{
			if(res < nums[i])
			{
				res = nums[i];
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {12,17,18,99,-88,7};
		int maxElement = max(nums);
		System.out.println("Max Element : " + maxElement);
		
	}
}
