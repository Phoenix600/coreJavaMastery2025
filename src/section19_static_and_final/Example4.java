package section19_static_and_final;

/**
 * File Name: Example4.java
 * Entity: Example4
 * Package: section19_static_and_final
 * Author: pranayramteke
 * Date: 25/04/25
 * Description:
 */

class Super
{
	final void method1()
	{
		System.out.println("Hello S2P Java Coders");
	}
}

class Child extends Super
{
//	@Override
//	void method1()
//	{
//		System.out.println("Hello C++ Developer");
//	}
	
	void method2()
	{
		System.out.println("Hello Rust Programmers");
	}
}

public class Example4
{
	public static void main(String[] args)
	{
		Child childInstance = new Child();
		childInstance.method1();
		childInstance.method2();
		
		Super superInstance = childInstance;
		superInstance.method1();
		
	}
}
