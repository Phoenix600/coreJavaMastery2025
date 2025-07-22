package section19_static_and_final;

/**
 * File Name: Example1.java
 * Entity: Example1
 * Package: section19_static_and_final
 * Author: pranayramteke
 * Date: 24/04/25
 * Description:
 */

class MyTest1
{
	static int x = 10;
	int y;
	
	void show()
	{
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
	}
	
	static void display()
	{
		System.out.println("X : " + x);
	}
}

public class Example1 {
	public static void main(String[] args) {
		MyTest1 t1 = new MyTest1();
		t1.show();
		
		MyTest1 t2 = new MyTest1();
		t2.show();

		System.out.println(MyTest1.x);
		MyTest1.display();
	}
}
