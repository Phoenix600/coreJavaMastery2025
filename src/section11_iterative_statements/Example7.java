package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example7.java
 * Entity: Example7
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 07/05/25
 * Description:
 */

public class Example7
{
	public static void main(String[] args) {
		int nStartPoint;
		int nEndPoint;
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the number range : ");
		System.out.println("Enter the startPoint   : ");
		nStartPoint = Input.nextInt();
		
		System.out.println("Enter the endPoint     : ");
		nEndPoint  = Input.nextInt();
		
		for(int i = nStartPoint; i <= nEndPoint; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Even : " + i);
			}
		}
		
	}
}
