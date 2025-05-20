package section6_Intellij_tools;

/**
 * File Name: Example4.java
 * Purpose: Teach Debugging using IntelliJ IDEA on a buggy program
 * Author: pranayramteke
 * Date: 20/05/25
 *
 * 🧠 Practice Topics:
 *   - Breakpoints 🔴
 *   - Step Over ⏭️
 *   - Step Into 🔽
 *   - Step Out 🔼
 *   - Resume ▶️
 *   - Stack Trace 📜
 *   - Watch & Evaluate Expressions 👀
 */

public class Example4 {
	public static void main(String[] args)
	{
		System.out.println("=== Student Gradebook Processor ===");
		
		// 🔴 Set a breakpoint here
		int numStudents = 3;
		
		String[] names = new String[numStudents];
		int[][] marks = new int[numStudents][5];
		
		// ❌ Off-by-one Error - i <= numStudents causes ArrayIndexOutOfBounds
		for (int i = 0; i <= numStudents; i++) {
			// 🔴 Set a breakpoint here and use ⏭️ Step Over
			names[i] = "Student" + i;
			
			// Add 5 dummy marks for each student
			for (int j = 0; j < 5; j++) {
				marks[i][j] = 40 + j + i;  // No validation, hardcoded
			}
		}
		
		System.out.println("\n===== Generating Report =====\n");
		
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Student: " + names[i]);
			
			// 🔽 Step Into this method
			printMarks(marks[i]);
			
			// ⏭️ Step Over this line and 👀 watch the value of avg
			double avg = calculateAverage(marks[i]);
			System.out.println("Average: " + avg);
			
			System.out.println("Grade: " + assignGrade(avg));
			
			// 👀 Inspect what happens here
			System.out.println("Status: " + getPassStatus(avg));
			System.out.println("-----------------------------------");
		}
		
		// ▶️ Resume program if paused
	}
	
	// ❌ Bug: Off-by-one in loop
	public static void printMarks(int[] scores) {
		for (int i = 0; i <= scores.length; i++) {
			System.out.println("Subject " + (i + 1) + ": " + scores[i]);
		}
	}
	
	// ❌ Bug: Integer division results in wrong average
	public static double calculateAverage(int[] scores) {
		int total = 0;
		for (int score : scores) {
			total += score;
		}
		
		// 👀 Use Evaluate Expression (⌥F8 / Alt+F8) for (double) total / scores.length
		return total / scores.length;  // Integer division mistake
	}
	
	public static String assignGrade(double avg) {
		if (avg >= 90) return "A";
		if (avg >= 75) return "B";
		if (avg >= 60) return "C";
		if (avg >= 40) return "D";
		return "F";
	}
	
	// ❌ Might return null (pointless fallback), observe in debugger
	public static String getPassStatus(Double avg) {
		if (avg >= 40.0) return "Pass";
		if (avg < 40.0) return "Fail";
		return null;
	}
}
