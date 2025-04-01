package section13_methods;

/**
 * File Name: Example3.java
 * Entity: Example3
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 01/04/25
 * Description: A method can return Object also
 *
 */

public class Example3
{
	static String findUsername(String email)
	{
		int a = email.indexOf('@');
		String name = email.substring(0,a);
		return name;
	}
	
	public static void main(String[] args) {
		String email = "s2p@gmail.com";
		String username = findUsername(email);
		
		System.out.println("Email : " + email);
		System.out.println("Username : " + username);
	}
}
