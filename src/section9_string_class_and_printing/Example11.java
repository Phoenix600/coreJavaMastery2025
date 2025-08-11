package section9_string_class_and_printing;

import java.util.Arrays;

public class Example11
{
    public static void main(String[] args)
    {

        int a = 12;
        int b = 13;
        int c = a + b;
        System.out.printf("A = %d and B = %d And Their Sum Is %d\n",a,b,c);

        String name = "Pranay";
        float cgpa  = 8.31f;
        double salary = 120000.00;

        System.out.printf("Hello My name is %s and I have CGPA Of %f and I have salary around %f.\n",name,cgpa,salary);

        int x = 10;
        int y = 11;

        System.out.printf("x = %d And y = %d \n",x,y);
        System.out.printf("x = %d And y = %d \n",y,x);
        System.out.printf("x = %1$d And y = %1$d \n",y);

    }
}
