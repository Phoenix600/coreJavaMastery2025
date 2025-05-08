package section24_lambda_expressions;

/**
 * File Name: Example4.java
 * Entity: Example4
 * Package: section24_lambda_expressions
 * Author: pranayramteke
 * Date: 08/05/25
 * Description:
 *
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 * 🔁 Passing Lambda Expression As A Parameter
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 *
 * ✅ Demonstrates how lambda expressions (anonymous functions) can be passed
 *    as arguments to methods.
 * ✅ Helps in reducing boilerplate code for strategies, callbacks, and behaviors.
 */

@FunctionalInterface
interface MyLambdaExpression1 {
	public abstract void display();
}

// 🔹 Class that consumes the lambda expression
class UseLambdaExpression {
	public void execute(MyLambdaExpression1 expression) {
		expression.display();  // 🔸 Invoking the lambda logic
	}
}

public class Example4 {
	
	// 🔹 Static method to accept and execute lambda expression
	public static void execute(MyLambdaExpression1 expression1) {
		expression1.display();
	}
	
	public static void main(String[] args) {
		
		// 🔸 Passing lambda expression directly as an argument
		execute(() -> {
			System.out.println("Hello People 👋");
		});
		
		// 🔸 Storing lambda in a variable and then passing it
		MyLambdaExpression1 expression = () -> {
			System.out.println("Hello JVM ☕️️");
		};
		execute(expression);
		
		// 🔸 Using a class method that accepts a lambda
		UseLambdaExpression expression1 = new UseLambdaExpression();
		expression1.execute(() -> {
			System.out.println("Running Lambda Expressions 🧠");
		});
		
		/*
		 * 📝 Developer Notes:
		 * ----------------------
		 * - Functional interfaces can represent behaviors passed as parameters.
		 * - Lambdas help with cleaner, more concise code (especially in functional-style programming).
		 * - This pattern is heavily used in frameworks like Streams API, GUI callbacks, and Executors.
		 */
	}
}