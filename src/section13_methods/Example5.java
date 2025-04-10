package section13_methods;

/**
 * File Name: Example5.java
 * Entity: Example5
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 01/04/25
 * Description:
 * Find GCD of two numbers
 */

public class Example5
{
	static int gcd(int m, int n)
	{
		while(n != m)
		{
			if(m > n)
			{
				m = m -n;
			}
			else
			{
				n = n - m;
			}
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		
		int result = gcd(45,115);
		
		System.out.println("GCD of 45 And 115 : " + result);
		
	}
}
