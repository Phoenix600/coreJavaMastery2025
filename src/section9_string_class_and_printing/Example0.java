package section9_string_class_and_printing;

// Printing In Java
public class Example0 {
    public static void main(String[] args) {
        int lnNum1 = 10;
        float lfNum1 = 12.003456f;
        boolean isEven = true;

        // Printing Text
        System.out.print("Hello JVM");
        System.out.print("This is Windows Platform");

        System.out.println("JavaCompiler Gives Byte Code");
        System.out.println("JVM Reads The Byte Code Line By Line And Executes On Target Platform");

        // Print Content Of Variables
        System.out.println(lnNum1);
        System.out.println(lfNum1);

        System.out.printf("Integer Number1 %d \n",lnNum1);
        System.out.printf("Float Number2  %f  \n",lfNum1);
        System.out.printf("Boolean Value %b \n",isEven);

        String formatedString = String.format("lnNum1: %d , lfNum1 : %f, isEven : %b",lnNum1,lfNum1,isEven);
        System.out.println(formatedString);
    }
}
