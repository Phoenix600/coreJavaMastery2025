package section11_iterative_statements;

import java.util.Scanner;

public class Example1
{
    public static void main(String...args)
    {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int lnSteps = Input.nextInt();

        System.out.println("Printing The First Natural Numbers From 1 to n : ");

        int number = 1; // 1,2,3,4,5,6,.....+Infinity
        while (number <= lnSteps)
        {
            System.out.println(number);
            number++;
        }

        System.out.println("End Of The Program");
    }
}
