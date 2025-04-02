package section13_methods;

/**
 * File Name: Example11.java
 * Entity: Example11
 * Package: section13_methods
 * Author: pranayramteke
 * Date: 03/04/25
 * Description:
 */

public class Example11 {
	
	static void showListOfNames(String...name)
	{
		for(String target : name)
		{
			System.out.println(target);
		}
	}
	
	public static void main(String[] args) {
		
		showListOfNames("Parth","Nayan","Mithilesh","Abdul","Naman","Max","Angela");
		
	}
}
