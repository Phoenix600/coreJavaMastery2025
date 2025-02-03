package section8_operators_and_expressions;

// Example On Bitwise Operators-1
public class Example10 {
    public static void main(String[] args)
    {
        int x = 10;
        // x  = 0b1010;
        int y = 6;
        int z;

        // 1010
        // 0110
        // 0010

        z = x & y;
        System.out.println(z);

        z = x | y;
        System.out.println(z);

        z = x ^ y;
        System.out.println(z);

        int result;

        result = x;
        System.out.println("Bit Pattern : " + Integer.toBinaryString(result));

        result = ~x;
        System.out.println("Bit Pattern : " + Integer.toBinaryString(result));

        result = x << 1;
        System.out.println("Result : " + result);

        result = y >> 1;
        System.out.println("Result : " + result);



        
    }
}
