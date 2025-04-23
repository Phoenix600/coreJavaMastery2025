package section18_inner_classes;

/**
 * File Name: Example3.java
 * Entity: Example3
 * Package: section18_inner_classes
 * Author: pranayramteke
 * Date: 23/04/25
 * Description:
 */

// Anonymous Inner Class
// Anonymous class can be defined at the time of creation of object itself.
// These anonymous classes are useful for interfaces and abstract classes.

abstract class MyAbstractClass
{
	abstract void display();
}

interface MyInterface
{
	void greet();
}

public class Example3 {
	public static void main(String[] args)
	{
		MyAbstractClass instance1 = new MyAbstractClass() {
			
			void display()
			{
				System.out.println("Hello World");
			}
		};
		
		instance1.display();
		
		MyAbstractClass instance2 = new MyAbstractClass() {
			
			void display()
			{
				System.out.println("Hello Java Programmers");
			}
		};
		
		instance2.display();
		
		MyInterface instance3 = new MyInterface(){
			public void greet()
			{
				System.out.println("Good Morning");
			}
		};
		
		instance3.greet();
		
		MyInterface instance4 = new MyInterface(){
			public void greet()
			{
				System.out.println("Good Night");
			}
		};
		
		instance4.greet();
		
	}
}
