package section22_multihreading;

/**
 * File Name: Example3.java
 * Entity: Example3
 * Package: section22_multihreading
 * Author: pranayramteke
 * Date: 07/05/25
 * Description:
 */

class ThreadTest1 extends Thread
{
	public void run()
	{
		synchronized (Example3.x)
		{
			System.out.println(Thread.currentThread().toString());
			System.out.println(Example3.x);
			System.out.println(Example3.x++);
		}
	}
}


class ThreadTest2 extends Thread
{
	public void run()
	{
		synchronized (Example3.x)
		{
			System.out.println(Thread.currentThread().toString());
			Example3.x = 1000;
			System.out.println(Example3.x);
		}
	}
}
public class Example3 {
	
	static Integer x = 10;
	
	public static void main(String[] args)
	{
		ThreadTest1 threadTest1 = new ThreadTest1();
		ThreadTest2 threadTest2 = new ThreadTest2();
		
		threadTest1.start();
		threadTest2.start();
		
	}
}
