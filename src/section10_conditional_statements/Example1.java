package section10_conditional_statements;

/**
 * File Name: Example1.java
 * Entity: Example1
 * Package: section10_conditional_statements
 * Author: pranayramteke
 * Date: 24/04/25
 * Description:
 */

public class Example1
{
	public static void main(String...args)
	{
		// Relational Operators
		int a = 10;
		int b = 17;
		int c = 10;
		
		// Result of logical operator will be boolean value
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a != b);
		
		System.out.println(a == c && a <= b);
		System.out.println(a == c || a >= b);
		
		System.out.println(!(a>= c));
		
		
		
		
	}
}
