package section13_methods;

/**
 * File Name: Example9.java
 * Entity: Example9
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 03/04/25
 * Description:
 */

public class Example9
{
	
	public static int reverse(int num)
	{
		int rev = 0;
		
		while (num != 0)
		{
			rev = rev * 10  + num%10;
			num = num / 10;
		}
		
		return rev;
	}
	
	public static int[] reverse(int[] nums)
	{
		int revNums[] = new int[nums.length];
		
		for(int i  = nums.length-1; i>=0; i--)
		{
			revNums[nums.length-1-i] = nums[i];
		}
		
		return revNums;
	}
	
	public static void display(int[] nums)
	{
		for(int x: nums)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int x = 123;
		System.out.println("Original Number : " + x);
		
		int rev = reverse(x);
		System.out.println("Reverse Number : " + rev);
		
		int nums[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Original Array : ");
		display(nums);
		
		System.out.println("Reverse Array : ");
		int[] revs =  reverse(nums);
		display(revs);
		
		
	}
}
