package section9_string_class_and_printing;

public class Example1 {
    public static void main(String[] args) {

        // Constructors
        String sData1 =  new String();
        String sData2 = "";

        String sPhrase = "Java Means S2P";
        String sCourse = new String("Core Java Is Not Java ME");

        char[] chars = {'A','B','C','D'};
        String sAlphabets = new String(chars);

        byte[] buffer = {65,66,67,68};
        String sBuffer = new String(buffer);

        System.out.println(sData1);
        System.out.println(sData2);

        System.out.println(sPhrase);
        System.out.println(sCourse);

        System.out.println(sAlphabets);
        System.out.println(sBuffer);

    }
}
