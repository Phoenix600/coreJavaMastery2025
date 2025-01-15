package section7_data_types_and_variables;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        float lfCGPA;
        double ldCollegeFess;

        System.out.println("Enter Your CGPA : ");
        lfCGPA = Input.nextFloat();

        System.out.println("Enter Your College Fess : ");
        ldCollegeFess = Input.nextDouble();

        System.out.println("Impressive Your College Fess is : " + ldCollegeFess);
        System.out.println("And Your College Fees is : " + lfCGPA);
    }
}
