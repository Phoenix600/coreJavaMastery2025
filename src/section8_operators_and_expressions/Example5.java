package section8_operators_and_expressions;

import java.util.Scanner;

/**
 * 💡 Instructions:
 * ========================================================================
 * This program calculates the area of a triangle using Heron's formula.
 * ========================================================================
 * Instructions for students:
 * 1. Declare variables to store the lengths of the sides of the triangle and other necessary calculations.
 * 2. Use the Scanner class to take user input for the lengths of the sides.
 * 3. Calculate the semi-perimeter (s) using the formula: s = (a + b + c) / 2.
 * 4. Use Heron's formula to calculate the area:
 *    Area = √(s * (s - a) * (s - b) * (s - c))
 * 5. Print the calculated area of the triangle.
 */
public class Example5 {
    public static void main(String[] args) {
        float a;
        float b;
        float c;

        float s;
        float area;

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the length of side a : ");
        a = Input.nextInt();

        System.out.println("Enter the length of side b : ");
        b = Input.nextInt();

        System.out.println("Enter the length of side c : ");
        c = Input.nextInt();

        s =  (a + b + c) / 2f;
        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area Of Triangle : " + area);

    }
}
