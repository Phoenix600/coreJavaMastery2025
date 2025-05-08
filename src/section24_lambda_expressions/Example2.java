package section24_lambda_expressions;

/**
 * File Name: Example2.java
 * Description: Demonstrates how to pass parameters to lambda expressions
 *              and how to return values from them using functional interfaces.
 * Author: Pranay Ramteke
 * Date: 08/05/2025
 */

// ✅ Functional Interface for accepting a parameter and printing
@FunctionalInterface
interface MyLambdaExpression {
	abstract void display(String name);
}

// ✅ Functional Interface for performing operations on two integers
@FunctionalInterface
interface MyOperator {
	int operation(int a, int b);  // Single Abstract Method
}

public class Example2 {
	public static void main(String[] args) {
		
		System.out.println("🎯 Lambda Expression with Parameter");
		String myName = "S2P Edutech";
		
		// Lambda with a single String parameter
		MyLambdaExpression expression = (String name) -> {
			System.out.println("Learning Lambda Expression at " + name);
		};
		expression.display(myName);
		
		System.out.println("\n🧠 Lambda Expressions with Parameters and Return Values");
		
		// Lambda to perform addition
		MyOperator operator = (int a, int b) -> {
			return a + b;
		};
		int result = operator.operation(10, 12);
		System.out.println("[+] Sum: " + result);
		
		// Lambda to perform subtraction
		operator = (int a, int b) -> {
			return a - b;
		};
		result = operator.operation(10, 12);
		System.out.println("[+] Difference: " + result);
		
		// Lambda to perform multiplication (shorter syntax)
		operator = (x, y) -> x * y;
		result = operator.operation(10, 12);
		System.out.println("[+] Product: " + result);
		
		// Lambda to perform division (shorter syntax)
		operator = (x, y) -> x / y;
		result = operator.operation(10, 3);
		System.out.println("[+] Division: " + result);
	}
}


/*
 * # 😍 Lambda Expression Features
 * -------------------------------------------------------------------------------------------
 * | Feature               | Explanation                                                     |
 * |-----------------------|-----------------------------------------------------------------|
 * | Lambda with parameter | `display(String name)` takes a name and prints a message        |
 * | Return values         | `operation(int a, int b)` returns results like sum, diff, etc.  |
 * | Type inference        | You can omit type declarations like `(a, b) -> a + b`           |
 * | Concise syntax        | Avoids boilerplate and promotes functional style                |
 * -------------------------------------------------------------------------------------------
 * ## Note:
 * Use `@FunctionalInterface` when defining a functional interface.
 */