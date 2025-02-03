package section8_operators_and_expressions;

public class Example11 {
    public static void main(String[] args) {
        // You can also store binary number in java variables
        int x = 0b1010;
        int y = 0b0110;
        int z;

        z = x | y;
        System.out.println("X | Y" + z);

        z = x ^ y;
        System.out.println("X ^ Y " + z);

        z = x & y;
        System.out.println("X & Y " + z);

        x = -0b1010;
        System.out.println(x);

    }
}
