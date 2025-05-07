package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example8.java
 * Entity: Example8
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 07/05/25
 * Description:
 */

public class Example8
{
	public static void main(String[] args) {
		
		int nTableIndex;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the number to generate the table of it : ");
		nTableIndex = Input.nextInt();
		
		for(int i = 1; i < 11; i++)
		{
			System.out.println(i*nTableIndex);
		}
		
	}
}
