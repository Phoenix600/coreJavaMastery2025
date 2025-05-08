package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example12.java
 * Entity: Example12
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 09/05/25
 * Description:
 */

public class Example12
{
	public static void main(String[] args)
	{
		int n;
		int originalNumber;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the number to make it reverse : ");
		n = Input.nextInt();
		
		originalNumber = n;
		
		int rem = 0;
		int rev = 0;
		
		while (n != 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n   = n/10;
		}
		
		if(rev == originalNumber)
		{
			System.out.println("Given Number Is Palindrome : " + rev);
		}
		else
		{
			System.out.println("Given Number Is Not Palindrome " + rev);
		}
	}
}
