package section24_lambda_expressions;

/**
 * File Name: Example5.java
 * Entity: Example5
 * Package: section24_lambda_expressions
 * Author: pranayramteke
 * Date: 08/05/25
 * Description: Method Refferences ..Upon function
 */

@FunctionalInterface
interface MyPrintable
{
	public abstract void print(String sData);
}

@FunctionalInterface
interface MyMehtod
{
	public abstract StringBuffer reverse();
}

@FunctionalInterface
interface MyUpperCase
{
	public abstract String upperCase();
}

public class Example5
{
	public static void main(String[] args)
	{
		MyPrintable printable = System.out::println;
		printable.print("Hello People");
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Hello");
		stringBuffer.append("World");
		
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.reverse());
		
		MyMehtod method = stringBuffer::reverse;
		System.out.println(method.reverse());
		
		String str = "yes it is hard..but it is fun";
		MyUpperCase strMethod = str::toUpperCase;
		System.out.println(strMethod.upperCase());
		
	}
}
