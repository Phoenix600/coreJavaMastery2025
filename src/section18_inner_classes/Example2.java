package section18_inner_classes;

/**
 * File Name: Example2.java
 * Entity: Example2
 * Package: section18_inner_classes
 * Author: pranayramteke
 * Date: 23/04/25
 * Description:
 */

/*
    Local Inner Class
    If you want any class to inherit from some existing class and implement interface and that class is
    used only inside given method, then we can define the local inner class
 */
class MyOuterClass
{
	void display()
	{
		class InnerClass
		{
			void innerDisplay()
			{
				System.out.println("Hello");
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.innerDisplay();
	}
}

public class Example2 {
}
