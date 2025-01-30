package section8_operators_and_expressions;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        int lnLength;
        int lnBreadth;
        int lnHeight;

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter The Length , Breadth & Height Of Cuboid");

        lnLength  = Input.nextInt();
        lnBreadth = Input.nextInt();
        lnHeight  = Input.nextInt();

        int volume = lnLength * lnBreadth * lnHeight;
        System.out.println("Volume : " + volume);
    }
}
