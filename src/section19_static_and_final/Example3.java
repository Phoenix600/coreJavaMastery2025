package section19_static_and_final;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * File Name: Example3.java
 * Entity: Example3
 * Package: section19_static_and_final
 * Author: pranayramteke
 * Date: 24/04/25
 * Description:
 */

class MyStaticBlockTest
{
	int x = 12;
	static int y;
	
	static
	{
		System.out.println("MyStaticBlockTest");
		System.out.println("Block-1");
		y = 17;
	}
	
	static
	{
		System.out.println("Block-2");
		System.out.println(y);
	}
	
	public void sayHello()
	{
		System.out.println("Hello From JVM");
	}
	
}

public class Example3 {
	public static <MyStaticBlock1> void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
		
		System.out.println("Main Class Function");
		Class  MyStaticBlock1 =  Class.forName("section19_static_and_final.MyStaticBlockTest");

	}
}
