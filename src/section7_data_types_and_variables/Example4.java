package section7_data_types_and_variables;

import java.util.Scanner;

/**
 * How To Read Data From Keyboard:
 * Scanner Class is used for reading data from different data sources.
 * Keyboard is one of the data source.
 * Scanner is present in util package. This class was provided in java from version 5.
 *
 */
public class Example4 {
    public static void main(String[] args) {

        // System class is used to access the resources of a computer system such as
        // output device (Console) and input device (Keyboard)

        // Creating The Object Of Scanner Class
        // This creates the connection from java program to keyboard.
        // Scanner class just provides the connection.
        // while creating the object of Scanner class, we have to specify which data
        // source should be connected.
        Scanner Input = new Scanner(System.in);

        // Integral Data Types
        byte   lbNumber;
        short  lsNumber;
        int    lnNumber;
        long   llNumber;

        // Decimal Data Types
        float  lfNumber;
        double ldNumber;

        // Character Data Type
        char   lcData;

        // Boolean Data Type
        boolean lbData;

        // String class (It not a primitive data type)
        String sName;
        String sFullName;

        System.out.println("Enter the short value : ");
        lsNumber = Input.nextShort();
        System.out.println("Entered Short Number : " + lsNumber);

        System.out.println("Enter the byte value : ");
        lbNumber = Input.nextByte();
        System.out.println("Entered Byte Number : " + lbNumber);

        System.out.println("Enter the int value : ");
        lnNumber = Input.nextInt();
        System.out.println("Entered Integer Number : " + lnNumber);

        System.out.println("Enter the long value : ");
        llNumber = Input.nextLong();
        System.out.println("Entered Long Number : " + llNumber);

        System.out.println("Enter the float value : ");
        lfNumber = Input.nextFloat();
        System.out.println("Entered Float Value : " + lfNumber);

        System.out.println("Enter the double value : ");
        ldNumber = Input.nextDouble();
        System.out.println("Entered Double Value : " + ldNumber);

        System.out.println("Enter the Single Word String Value : ");
        sName = Input.next();
        System.out.println("Entered String value : " + sName);

        System.out.println("Enter the Multiple Words String value : ");
        Input.nextLine();
        sFullName = Input.nextLine();
        System.out.println("Entered String Value : " + sFullName);

        System.out.println("Enter the Character value : ");
        lcData = Input.next().charAt(0);
        System.out.println("Entered Char value : " + lcData);

        System.out.println("Enter the boolean value : ");
        lbData = Input.nextBoolean();
        System.out.println("Entered Boolean value : " + lbData);
    }
}
