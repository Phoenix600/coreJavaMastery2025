package section11_iterative_statements;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int number = Input.nextInt();

        int sum = 0;
        while (number != 0)
        {
            sum = sum + number % 10;
            number = number/10;
        }

        System.out.println("Sum Of Digits : " + sum);
    }
}
