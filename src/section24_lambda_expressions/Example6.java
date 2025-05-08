package section24_lambda_expressions;

/**
 * File Name: ConstructorReferenceExample.java
 * Entity: ConstructorReferenceExample
 * Package: section24_lambda_expressions
 * Author: pranayramteke
 * Date: 08/05/25
 * Description:
 *
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 * 🧱 Constructor Reference using ClassName::new
 * ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
 *
 * ✅ Constructor reference allows you to refer to a constructor without invoking it.
 * ✅ It is used when you want to create instances in a functional style.
 */

@FunctionalInterface
interface MessageCreator {
	Message getMessage(String msg);
}

// 🔹 A simple Message class with parameterized constructor
class Message {
	String content;
	
	public Message(String content) {
		this.content = content;
		System.out.println("Message Created: " + content);
	}
}

public class Example6 {
	public static void main(String[] args) {
		
		// 🔸 Using Lambda Expression
		MessageCreator creator1 = (text) -> new Message(text);
		creator1.getMessage("Created using Lambda");
		
		// 🔸 Using Constructor Reference
		MessageCreator creator2 = Message::new;
		creator2.getMessage("Created using Constructor Reference");
		
		/*
		 * 📝 Developer Notes:
		 * ----------------------
		 * - Constructor reference can be used with functional interfaces.
		 * - Syntax: ClassName::new
		 * - The functional interface method signature must match the constructor signature.
		 */
	}
}