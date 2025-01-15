package section7_data_types_and_variables;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String sName;
        String sLineAboutYou;

        // next() method is used to read single word from keyboard
        System.out.println("Hello, May I Know Your Name : ");
        sName = Input.next();

        // nextLine() method is used to read multiple words from keyboard
        System.out.println("Can You Describe Yourself In A Single Line");
        sLineAboutYou = Input.nextLine();

        System.out.println("Hello, " + sName);
        System.out.println("Wow That's Some Hard Stuff : " + sLineAboutYou);
    }
}
