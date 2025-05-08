package section11_iterative_statements;

import java.util.Scanner;

/**
 * File Name: Example14.java
 * Entity: Example14
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 09/05/25
 * Description:
 */

public class Example14
{
	public static void main(String[] args) {
		
		
		String res = "";
		int number;
		var Input = new Scanner(System.in);
		
		System.out.println("Enter The Integer Number : ");
		number = Input.nextInt();
		
		
		var rem = 0;
		while (number != 0)
		{
			rem = number % 10;
			
			switch (rem)
			{
				case 0:
					res = "Zero" + res;
					break;
				case 1:
					res = "One" + res;
					break;
				case 2:
					res = "Two" + res;
					break;
				case 3:
					res = "Three" + res;
					break;
				case 4:
					res = "Four" + res;
					break;
				case 5:
					res = "Five" + res;
					break;
				case 6:
					res = "Six" + res;
					break;
				case 7:
					res = "Seven" + res;
					break;
				case 8:
					res = "Eight" + res;
					break;
				case 9:
					res = "Nine" + res;
					break;
				default:
					System.out.println("Invalid Number");
					break;
			}
			
			number = number/10;
		}
		
		
		System.out.println("Result : " + res);
		
	}
}
