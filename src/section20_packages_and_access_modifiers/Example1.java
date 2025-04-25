package section20_packages_and_access_modifiers;

/**
 * File Name: Example1.java
 * Entity: Example1
 * Package: section20_packages_in_java
 * Author: pranayramteke
 * Date: 28/04/25
 * Description:
 * 1. Class/Interface/Abstract in compiled are stored in the form of class-file.
 * 2. Package is a folder which stores related class-files. So package is nothing but the collection of set
 * of classes, interfaces and sub-packages.
 * 3. Explore builtin packages provided by java.
 */
public class Example1
{
	public static void main(String[] args)
	{
		// You can use classes this or use import statements
		java.lang.String sName = new java.lang.String("S2P Edutech");
		System.out.println(sName);
		
	}
}
