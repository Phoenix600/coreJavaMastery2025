package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example6.java
 * Entity: Example6
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 07/05/25
 * Description:
 */

public class Example6 {
	
	public static void main(String[] args)
	{
		int nSteps;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the value of n : ");
		nSteps = Input.nextInt();
		
		System.out.println("Down Counter : ");
		for(int i = nSteps; i >= 0; i--)
		{
			System.out.println(i);
		}
	}
}
