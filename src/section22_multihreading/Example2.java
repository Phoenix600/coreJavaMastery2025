package section22_multihreading;

/**
 * File Name: Example2.java
 * Entity: Example2
 * Package: section22_multihreading
 * Author: pranayramteke
 * Date: 07/05/25
 * Description:
 */

class MyThreadTest1 implements Runnable
{
	@Override
	public void run()
	{
		int x = 0;
		while (x <= 100)
		{
			System.out.println("S2P");
			x++;
		}
	}
}

class MyThreadTest2 implements Runnable
{
	@Override
	public void run()
	{
		int x = 0;
		while (x <= 100)
		{
			System.out.println("Java Course");
			x++;
		}
	}
}

public class Example2
{
	public static void main(String[] args) {
		
		MyThreadTest1 threadTest1 = new MyThreadTest1();
		MyThreadTest2 threadTest2 = new MyThreadTest2();
		
		Thread thread1 = new Thread(threadTest1);
		Thread thread2 = new Thread(threadTest2);
		
		thread2.start();
		thread1.start();
		
	}
}
