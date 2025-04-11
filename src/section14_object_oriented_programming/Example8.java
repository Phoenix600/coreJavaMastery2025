package section14_object_oriented_programming;

/**
 * File Name: Example8.java
 * Entity: Example8
 * Package: section14_object_oriented_programming
 * Author: pranayramteke
 * Date: 10/04/25
 * Description:
 */

class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return String.format("Name : %s\nAge : %d \n",name,age);
	}
}

public class Example8
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Pranay", 21);
		Person p2 = new Person("Rekha", 20);
		Person p3 = new Person("Jaya",22);
		Person p4 = new Person("Anjali",21);
		Person p5 = new Person("Rahul",22);
		
		Person[] people = new Person[5];
		
		people[0] = p1;
		people[1] = p2;
		people[2] = p3;
		people[3] = p4;
		people[4] = p5;
		
		for(Person p : people)
		{
			System.out.println(p);
		}
	}
}
