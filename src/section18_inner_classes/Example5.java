package section18_inner_classes;

/**
 * File Name: Example8.java
 * Entity: Example8
 * Package: section18_inner_classes
 * Author: pranayramteke
 * Date: 23/04/25
 * Description:
 */

class OuterClass
{
	static int x = 10;
	int y = 20;
	
	static class Inner
	{
		void display()
		{
			System.out.println(x);
//			System.out.println(y);
		}
	}
	
}

public class Example5
{
	public static void main(String[] args) {
		
		// Static Inner Classes Can Be Access Directly Without Creating The Object Outer Class
		OuterClass.Inner inner  = new OuterClass.Inner();
		inner.display();
		
	}
}
