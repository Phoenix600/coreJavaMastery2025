package section19_static_and_final;

import java.util.Arrays;

/**
 * File Name: Example2.java
 * Entity: Example2
 * Package: section19_static_and_final
 * Author: pranayramteke
 * Date: 24/04/25
 * Description:
 */

public class Example2
{
	int x = 12;
	static int y;
	
	static
	{
		System.out.println("Block-1");
		y = 17;
	}
	
	static
	{
		System.out.println("Block-2");
		System.out.println(y);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main");
	}
}
