package section8_operators_and_expressions;

public class Example3 {
    public static void main(String[] args) {

        byte b1 = 10;
        short s1 = 2300;


        // byte + short --> integer only
        int sum = b1 + s1;

        // float + long -> float
        float f1 = 12.13f;
        long l1  = 12213L;

        float lfSum = l1 + f1;

        // float + double
        float lf2 = 12.12f;
        double ld2 = 12.1212;
        double ldSum = ld2 + lf2;

        // Character + Integer -> Integer
        char lcCharacter = 99;
        int lnNextValue  = 2;
        int lnResult     = lcCharacter + lnNextValue;



    }
}
