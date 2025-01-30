package section8_operators_and_expressions;

/**
 * ============================================
 * Pre-Increment/Decrement And Post-Increment/Decrement Operators
 * ============================================
 * 1. Increment operators can work with numerical data types
 *    including byte, short, int, long, float, double and character.
 *
 * 2. On boolean type of variables, you can not perform
 *    increment/decrement operators.
 *
 *    Increment/Decrement Operators used in an expression behaves differently.
 *    When used independently, they behave same.
 */

// Run Application In Debugger Mode 🐞
public class Example8 {
    public static void main(String[] args) {

        int lnNum1 = 5;

        lnNum1++;
//        ++lnNum1;
        System.out.println(lnNum1);
        System.out.println();

        lnNum1 = 5;
        int lnResult = lnNum1++;

        System.out.println("Result : " + lnResult);
        System.out.println("x      : " + lnNum1);
    }
}
