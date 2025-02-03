package section8_operators_and_expressions;

public class Example12 {
    public static void main(String[] args) {
        int a = 0b100010010011100;
        int x = 0b000000000000001;

        // Setting The Status Of ith Bit
        int z;
        // Masking Operation
        // left shift & Bitwise AND Operation
        x = x<<7;
        z = a & x;

        if(z != 0)
        {
            System.out.println("7th Bit is Active");
        }
        else
        {
            System.out.println("7th Bit is Not Active");
        }

        // Merging Operation
        x = 1;
        x = x<<8;  // 0b000000100000000;
        a = a | x;

    }
}
