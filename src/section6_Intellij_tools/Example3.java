package section6_Intellij_tools;

import java.util.Scanner;

/**
 * File Name: Example3.java
 * Author: pranayramteke
 * Purpose: Debugging playground for students in IntelliJ
 *
 * 💡 Practice Concepts:
 *  - Breakpoints 🔴
 *  - Step Into 🔽
 *  - Step Over ⏭️
 *  - Step Out 🔼
 *  - Resume ▶️
 *  - NullPointerException 🔥
 *  - ArrayIndexOutOfBoundsException 💥
 *  - Logical Bugs 🧠
 */

public class Example3 {
	
	// 🔽 Step Into to explore the division issue
	public static double calculateAverage(int total, int count) {
		return total / count;  // ⚠️ Integer division → forces precision loss
	}
	
	// 🔽 Step Into this and test for edge-case input
	public static int[] readMarks(int size) {
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[size];
		System.out.println("Enter marks for " + size + " students:");
		
		// 💥 Off-by-one bug: i <= size causes ArrayIndexOutOfBounds
		for (int i = 0; i <= size; i++) {
			System.out.print("Student " + (i + 1) + ": ");
			marks[i] = sc.nextInt();  // ⚠️ Exception on final iteration
		}
		
		return marks;
	}
	
	// 🔽 Step Into this method and watch loop values 👀
	public static int findMax(int[] marks) {
		int max = 0;
		
		// 💥 Off-by-one bug: i <= marks.length leads to crash
		for (int i = 0; i <= marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		}
		
		return max;
	}
	
	// ⏭️ Step Over and 👀 watch variables 'total', 'avg', and 'max'
	public static void printStatistics(int[] marks) {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		
		double avg = calculateAverage(total, marks.length);  // 🧠 Integer division here
		int max = findMax(marks);  // 💥 Might throw exception
		
		System.out.println("\nTotal Marks: " + total);
		System.out.println("Average Marks: " + avg);
		System.out.println("Highest Marks: " + max);
	}
	
	// 🔽 Step Into and 👀 watch values of 'pass' and 'fail'
	public static void calculatePassFail(int[] marks) {
		int pass = 0, fail = 0;
		for (int mark : marks) {
			if (mark >= 40) {
				fail++;  // 🧠 Logical bug: this should increment pass!
			} else {
				pass++;  // 🧠 Logical bug: this should increment fail!
			}
		}
		System.out.println("Pass: " + pass + ", Fail: " + fail);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		
		// 🔴 Set breakpoint here and ▶️ resume after catching exception
		int[] marks = readMarks(n);  // 💥 Dangerous call with broken loop
		
		printStatistics(marks);  // 🔼 Step Out after stepping into `findMax`
		
		calculatePassFail(marks);  // ⏭️ Step Over
		
		// 🔽 Step Into this nested loop sort and 👀 watch values swap
		System.out.println("Sorted Marks:");
		for (int i = 0; i < marks.length; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] < marks[j]) {  // 🧠 Incorrect order → sorts descending instead of ascending
					int temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
				}
			}
			System.out.print(marks[i] + " ");
		}
		
		// 🔥 Intentional NullPointerException
		String[] remarks = null;
		
		// 🔴 Set breakpoint and 👀 Stack Trace on crash
		System.out.println("\nFirst Remark: " + remarks[0]);  // 💥 NPE
	}
}
