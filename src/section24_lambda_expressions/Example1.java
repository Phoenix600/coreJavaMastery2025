package section24_lambda_expressions;

/*
 * What Are Lambda Expressions?
 * ----------------------------
 * 1. Lambda expressions allow us to write concise, anonymous methods (functions without a name).
 * 2. They are often used with functional interfaces (interfaces that contain only one abstract method).
 * 3. Lambdas help reduce boilerplate code, especially when passing behavior as parameters or defining quick actions.
 */

// ✅ Functional Interface - Only One Abstract Method Allowed
@FunctionalInterface
interface MyLambda {
	void display();  // Functional method (Single Abstract Method)
}

// ❌ Traditional Class Implementation (Verbose)
class MyLambdaImpl implements MyLambda {
	@Override
	public void display() {
		System.out.println("Getting Started With Lambda Expressions In S2P");
	}
}

public class Example1 {
	public static void main(String[] args) {
		
		System.out.println("⛳ 1. Traditional Way Using Class Implementation");
		MyLambdaImpl instance1 = new MyLambdaImpl();
		instance1.display();
		
		// Polymorphism using interface reference
		MyLambda instance2 = new MyLambdaImpl();
		instance2.display();
		
		System.out.println("\n⚡ 2. Using Anonymous Inner Class");
		MyLambda instance3 = new MyLambda() {
			@Override
			public void display() {
				System.out.println("Lambda Expression Using Anonymous Class");
			}
		};
		instance3.display();
		
		System.out.println("\n🚀 3. Using Lambda Expression (Simplified Version)");
		MyLambda instance4 = () -> {
			System.out.println("Lambda Expression Using Lambda Syntax");
		};
		instance4.display();
		
		System.out.println("\n🌟 4. Even Shorter Lambda (Single Statement - No Braces)");
		MyLambda instance5 =  () -> System.out.println("Shortest Lambda Form for Single Statement");
		instance5.display();
		
		
	}
}