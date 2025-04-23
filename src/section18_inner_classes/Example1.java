package section18_inner_classes;

/**
 *  Topics To Be Covered:
 *   Types Of Inner Class
 *      1. Nested Inner Class
 *      2. Local Inner Class
 *      3. Anonymous Inner Class
 *      4. static inner class
 *
 *     We can define a class inside another class.
 *     Outer class can have an inner class inside that is also called as inner class.
 *     If you have a class and it is becoming very big and complex.
 *     To reduce the complexity of bigger class. you can deifine the class inside another class.
 *     We can also deifine interface inside.
 *
 *     1. Nested Inner Class :
 *        a) Inner Class can access the members of outer class (It will be just like global variables for inner class)
 *        b) We can inner class by creating it's object inside inner class.
 *        c) Outer class can not access data memebers of inner class directly unless it has created the object of inner class.
 *        d) It is possible to create the object inner class outside of outer class but it is useless.
 *        e) For Every class in java, a separte compiled *.class is created, for inner class Outer$Inner.class file created
 */

class Outer
{
	int x = 12;
	
	class Inner
	{
		int y = 17;
		
		public void display()
		{
			System.out.println("Inner Class : " + x);
			System.out.println("Inner Class : " + y);
		}
	}
	
	public void display()
	{
		Inner inner = new Inner();
		inner.display();
	}
}

public class Example1 {
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.display();
		
		Outer.Inner inner = new Outer().new Inner();
		inner.display();
		
	}
}
