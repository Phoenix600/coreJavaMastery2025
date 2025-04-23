package section18_inner_classes;

/**
 * File Name: Example4.java
 * Entity: Example4
 * Package: section18_inner_classes
 * Author: pranayramteke
 * Date: 23/04/25
 * Description:
 */

interface IMyInterface
{
	void display();
}

class MyOuter
{
	public void display()
	{
		
		System.out.println("MyOuter Display");
		
		IMyInterface instance = new IMyInterface()
		{
			@Override
			public void display() {
				System.out.println("Hello");
			}
		};
		
		instance.display();
	}
}

public class Example4
{
	public static void main(String[] args)
	{
		MyOuter object = new MyOuter();
		object.display();
	}
}
