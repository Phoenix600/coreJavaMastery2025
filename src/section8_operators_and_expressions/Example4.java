package section8_operators_and_expressions;

import java.util.Scanner;

/**
 * ========================================================
 * 💡 Instructions:
 * ========================================================
 * 1. Create The Scanner Class Object To Read Data From Keyboard
 * 2. Create Two Float Variables For Storing Value Of Base And Height
 * 3. Print The Message On Console To User For Entering The Value Of Base And Height
 * 4. Create Another Variable Float To Store Area
 * 5. Print The Area Of Triangle
 */

// Student Challenge-1:
public class Example4 {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);
        float lfBase;
        float lfHeight;
        
        System.out.println("Enter the base of triangle : ");
        lfBase = Input.nextFloat();

        System.out.println("Enter the height of triangle : ");
        lfHeight = Input.nextFloat();

        float lfArea = (lfBase * lfHeight)/2;
        System.out.println("Area Of Triangle : " + lfArea);

    }
}
