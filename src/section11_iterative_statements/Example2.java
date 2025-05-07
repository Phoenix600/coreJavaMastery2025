package section11_iterative_statements;

import java.util.Scanner;

public class Example2
{
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int number = Input.nextInt();

        int count = 0;
        while (number != 0)
        {
            count++;
            number = number/10;
        }

        System.out.println("Number Of Digits : " + count);
    }
}
