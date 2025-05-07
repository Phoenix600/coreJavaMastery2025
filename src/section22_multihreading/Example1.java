package section22_multihreading;


/**
 * ========================
 * Some Points To Remember:
 * ========================
 *  1. Running more than one program that is running multiple programs
 *  on a single machine or a computer is known as multiprogramming.
 *
 *  2. The idea of multiprogramming started from the utilisation of the CPU
 *  when it is idle as the CPU works for just few time in the whole hour.
 *
 *  3. There are different form of multiprogramming.
 *       A) Multi-user: more than one user using the machine / running their
 *       programs simultaneously.
 *          • for connecting more than one user to single computer the
 *            DUMMY TERMINALS were used.
 *
 *          • Here the ROUND ROBIN fashion was introduced as the
 *            programs were executed simultaneously.
 *
 *          • UNIX and LINUX are famous operating systems for the multi-
 *            user environment.
 *
 *          • Multi-user machines were known as TIME_SHARING
 *            machines.
 *
 */

class MyThread1 extends Thread
{
	public void run()
	{
		int lnMax = 100;
		int count = 0;
		while (count <= lnMax)
		{
			System.out.println("Hello " + count);
			count++;
		}
	}
}

class MyThread2 extends Thread
{
	public void run()
	{
		int lnMax = 100;
		int count = 0;
		while (count <= lnMax)
		{
			System.out.println("World " + count);
			count++;
		}
	}
}

public class Example1
{
	public static void main(String[] args) {
		
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
		
		thread1.start();
		thread2.start();
		
		int lnMax = 100;
		int count = 0;
		while (count <= lnMax)
		{
			System.out.println("Java " + count);
			count++;
		}
	}
}
