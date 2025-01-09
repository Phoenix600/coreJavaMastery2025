package section5_introductionToJava;
import java.lang.*;
import java.util.Scanner;

// Reading Data From Keyboard Using Scanner Class
public class Example4 {
    public static void main(String[] args)
    {
        Scanner Input = new Scanner(System.in);

        byte x1;
        short x2;
        int x3;
        long x4;

        float x5;
        double x6;

        char x7;

        boolean flag;

        String name;
        String aboutMe;

        System.out.println("Enter the byte value for x1 : ");
        x1 = Input.nextByte();

        System.out.println("Enter the short value for x2 : ");
        x2 = Input.nextShort();

        System.out.println("Enter the int value for x3 : ");
        x3 = Input.nextInt();

        System.out.println("Enter the long value for x4 : ");
        x4 = Input.nextLong();

        System.out.println("Enter the float value for x5 : ");
        x5 = Input.nextFloat();

        System.out.println("Enter the double value for x6 : ");
        x6 = Input.nextDouble();

        System.out.println("Enter the character value x7 : ");
        x7 = Input.next().charAt(0);

        System.out.println("Enter the boolean value for flag : ");
        flag = Input.nextBoolean();

        System.out.println("Enter the your name : ");
        name = Input.next();

        System.out.println("Enter about you : ");
        aboutMe = Input.nextLine();

        System.out.println("Data Provided By User : ");

        System.out.println("Byte     : " + x1);
        System.out.println("Short    : " + x2);
        System.out.println("Integer  : " + x3);
        System.out.println("Long     : " + x4);

        System.out.println("Float    : " + x5);
        System.out.println("Double   : " + x6);

        System.out.println("Char     : " + x7);

        System.out.println("Flag     : " + flag);

        System.out.println("String   : " + name);
        System.out.println("String   : " + aboutMe);

        // closing the connection
        Input.close();

    }
}
