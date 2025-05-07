package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example9.java
 * Entity: Example9
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 07/05/25
 * Description:
 */

public class Example9
{
	public static void main(String[] args) {
		int lnNumber;
		var Input = new Scanner(System.in);
		
		System.out.println("Enter the number to find the sum : ");
		lnNumber = Input.nextInt();
		
		var sum = 0;
		for(var i = 1; i <= lnNumber; i++) // Head
		{
			sum = sum + i;
		}
		
		System.out.println("SUM : " + sum);
		
	}
}
