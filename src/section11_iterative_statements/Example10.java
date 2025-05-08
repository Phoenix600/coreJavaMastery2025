package section11_iterative_statements;
import java.util.Scanner;

/**
 * File Name: Example10.java
 * Entity: Example10
 * Package: section11_iterative_statements
 * Author: pranayramteke
 * Date: 09/05/25
 * Description:
 */

public class Example10
{
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		int n;
		
		System.out.println("Enter The Value Of N For Computing Factorial : ");
		n = Input.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i<= n; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial Of " + n + " is : " + fact);
		
	}
}
