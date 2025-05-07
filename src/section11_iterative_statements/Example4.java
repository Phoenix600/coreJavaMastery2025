package section11_iterative_statements;

import java.util.Scanner;

public class Example4
{
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter The Value of M : ");
        int m = Input.nextInt();

        System.out.println("Enter The Value Of N : ");
        int n = Input.nextInt();

        while (m != n)
        {
            if(m > n)
            {
                m = m - n;
            }
            else
            {
                n = n - m;
            }
        }

        System.out.printf("GCD : %d",n);
    }
}
