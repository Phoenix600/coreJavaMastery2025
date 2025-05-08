package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example13.java
 * Entity: Example13
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 09/05/25
 * Description:
 */

public class Example13
{
	public static void main(String[] args)
	{
		int m;
		int n;
		int res = 1;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the value of base m : ");
		m = Input.nextInt();
		
		System.out.println("Enter the value of power n : ");
		n = Input.nextInt();
		
		
		for(int i = 0; i< n; i++)
		{
			res = res * m;
		}
		
		System.out.printf("Pow(%d, %d) :  %d",m,n,res);
		
	}
}
