package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example5.java
 * Entity: Example5
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 07/05/25
 * Description:
 */

public class Example5
{
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		int nSteps;
		
		System.out.println("Enter The Value Of N : ");
		nSteps = Input.nextInt();
		
		System.out.println("Up-Counter : ");
		for(int i=0; i <= nSteps; i++)
		{
			System.out.println(i);
		}
		
	}
}
