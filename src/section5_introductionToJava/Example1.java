package section5_introductionToJava;

// Lang is package which contains all essential features for running java program.
// If you don't import it, it gets automatically imported by compiler.
import java.lang.*;

// Every java program is written in the form class
// ClassName should be sames as FileName
public class Example1 {

    // main method is the starting point of execution
    public static void main(String[] args)
    {
        // This is used for printing message on console / terminal
        System.out.println("Hello 2025 Year");
    }
}

// We can not use features of class, unless we have created the object.
// If you want to use specific feature of class without creating the object of class then
// that feature should be declared with static keyword.
// JVM has to call main method without creating the object of Class.
// CommandLine argument -> This is optional argument, but you have to write this everytime.
// println is a method for printing data on console.
//