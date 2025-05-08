package section24_lambda_expressions;

/**
 * File Name: Example3.java
 * Entity: Example3
 * Package: section24_lambda_expressions
 * Author: pranayramteke
 * Date: 08/05/25
 * Description:
 *
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 * 🧠 Lambda Expressions & Variable Capturing
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 *
 * ✅ Lambda expressions can access:
 *    🔹 Local variables (if final or effectively final)
 *    🔹 Instance variables (can be modified)
 * ❌ Cannot use local variables that are reassigned after lambda definition
 */

@FunctionalInterface
interface MyFunctionalExpression {
	void display();
}

class MyDemo {
	
	// 🔸 Instance variable (can be accessed and modified in lambda)
	int temp = 10;
	
	public void method1() {
		
		// 🔹 Local variable (effectively final)
		boolean isRich = true;
		
		// 🔹 Lambda Expression capturing local and instance variables
		MyFunctionalExpression expression = () -> {
			int count = 0; // Local variable inside lambda (allowed to modify internally)
			System.out.println("Hello Future Programmers");
			
			// ✅ Using and modifying local lambda-scoped variable
			System.out.println("Initial Count : " + count);
			System.out.println("Incremented Count : " + (++count));
			
			// ✅ Accessing effectively final local variable from enclosing scope
			System.out.println("Are You Rich : " + isRich);
			
			// ✅ Access and modify instance variable
			System.out.println("Initial temp : " + temp);
			++temp;
			System.out.println("Updated temp : " + temp);
		};
		
		expression.display();
		
		// ❌ Uncommenting below line would make `isRich` not effectively final
		// isRich = false;
	}
}

public class Example3 {
	public static void main(String[] args) {
		MyDemo demo = new MyDemo();
		demo.method1();
	}
}