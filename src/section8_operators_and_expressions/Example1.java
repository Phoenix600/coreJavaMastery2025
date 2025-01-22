package section8_operators_and_expressions;

/**
 *  🏆 Topics To Be Covered
 *  =================================================================
 *  1. About Operators
 *  2. Writing Expression
 *  3. Operator Precedence
 *  4. Result of Expression
 * -----------------------------------
 *  🚨 Arithmetic Operators
 *  ====================================================================
 *  +, -, /, *, %
 *  -------------------------------------------------------------------
 *  These operations can be applied on any data except boolean.
 *  int + int
 *  float + float
 *  double + double
 *  char + char
 *  int + float
 * ===================================================================
 * 🚨 Important:
 *  (%) mod operation can also work with float data types.
 *  float % float -> float
 *  ==================================================================
 *   %, * , / ---> Have Higher Precedence Compare To +, -
 *   Parenthesis are used for changing the precedence of operators.
 *  ==================================================================
 *  Ex-1.
 *  a = 10
 *  b = 15
 *  a + b/5 ==> 13
 *  ( a + b ) / 5 ==> 5
 *  ====================================================================
 *  Ex-2.
 *  c = 2
 *  a + b / 2 * c ==> a + 7 * c
 *                ==> a + 7 * 2
 *                ==> a + 14
 *                ==> 24
 *  ( a + b ) / ( 2 * c )
 *  => ( 10 + 15 ) / (2 * 2)
 *  => ( 25 ) / ( 4 )
 *  => 6
 *  ====================================================================
 *  Ex-3.
 *  a^2 - b^2
 *  a*a - b*b
 *  ==============
 *  ⚠ Important:
 *  ==============
 *  Numerical Data Types Addition Always leads to Integer Data As A Result
 *  byte + byte
 *  short + short
 *  byte + short
 *  int + int
 *  short + int
 *
 *  Coercion in a compiler is the automatic process of converting a value from
 *  one data type to another.
 *
 *  char + integer = integer
 *  short + integer = integer
 *  byte + integer = integer
 *  long + integer = integer
 *  float + integer = float
 *  double + integer = double
 *
 *  Calculation Always Happen In Higher Data Type.
 */
public class Example1 {

    public static void main(String[] args) {

        // Arithmetic Operators With Integral Types
        byte lbNum  = 12;
        short lsNum = 130;
        int lnNum   = 2200;
        long llNum  = 1000000L;
        long llSum;
        char lcChar = 'A'; // 65 ASCII Value

        // Byte + Short --> Integer
        int lnSum   = lbNum + lsNum;
        System.out.println(lnSum);

        // Short + Integer --> Integer
        lnSum  = lsNum + lnNum;
        System.out.println(lnSum);

        // Integer + Integer --> Integer
        lnSum = lnNum + 12000;
        System.out.println(lnSum);

        // Long + Integer --> Long
        llSum = lnNum + 1234567L;
        System.out.println(llSum);

        // Char + Integer --> Integer
        lnSum = lcChar + 5;
        System.out.println(lnSum);
    }
}
