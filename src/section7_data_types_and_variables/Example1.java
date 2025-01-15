package section7_data_types_and_variables;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Enter a number-1 : ");
        a = Input.nextInt();

        System.out.println("Enter a number-2 : ");
        b = Input.nextInt();

        c = a + b;
        System.out.println("Sum : " + c);
    }
}
