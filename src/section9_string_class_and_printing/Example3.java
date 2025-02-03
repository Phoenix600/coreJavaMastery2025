package section9_string_class_and_printing;

// String Methods
public class Example3 {
    public static void main(String[] args) {

        // Create String Reff Variable With name sData and Store "S2p Java Primal Course"
        String sData = "S2P Java Primal Course";

        // Create a new Integer variable store the length of string in it
        int length = sData.length();
        // Print length of string
        System.out.println("Length : " + length);

        String sDataLowerCase = sData.toLowerCase();
        System.out.println("LowerCase : " + sDataLowerCase);

        String sDataUpperCase = sDataLowerCase.toUpperCase();
        System.out.println("UpperCase : " + sDataUpperCase);

        String sExtraSpaces = "  Are MERN Stack Person Or MEAN Stack Person?   ";
        System.out.println("Extra Spaces   : " + sExtraSpaces);

        String sTrimmedData = sExtraSpaces.trim();
        System.out.println("After Trimming : " + sTrimmedData);

        String sWelcomePhrase = "Hello Future Java Programmers";
        String sSubString1 = sWelcomePhrase.substring(4);
        String sSubString2 = sWelcomePhrase.substring(5,9);

        System.out.println("SubString : " + sSubString1);
        System.out.println("SubString : " + sSubString2);

        String sSomeMoreData = "are you ready to explore java?";
        String sReplacedString =  sSomeMoreData.replace('a','A');

        System.out.println("Original String : " + sSomeMoreData);
        System.out.println("Replace String  : " + sReplacedString);

        String sWiseWords = "No One Cares About Clean Code, It Should Be Deliverable";
        boolean result;

        result = sWiseWords.startsWith("No One");
        System.out.println("Start With 'No One' : " + result);

        result = sWiseWords.endsWith("Be Deliverables");
        System.out.println("Ends With 'Be Deliverables' : " + result);

        String sCourseName = "Java Full Stack Dev S2P";
        char cData = sCourseName.charAt(11);
        System.out.println("Char At Index 11 : " + cData);

        String myWebsiteDomain = "https://www.s2pedutech.com";
        int index = myWebsiteDomain.indexOf('w');
        System.out.println("Index Of w : " + index);

        index = myWebsiteDomain.lastIndexOf('w');
        System.out.println("Last Index Of W : " + index);

        index = myWebsiteDomain.indexOf('e',16);
        System.out.println("Index Of e After 16th Place : " + index);

        index = myWebsiteDomain.indexOf(".");
        System.out.println("Index Of '.' : " + index);

        index = myWebsiteDomain.lastIndexOf(".");
        System.out.println("SLast Index Of '.' : " + index);

        String sStudentName1 = "Rohan";
        String sStudentName2 = "rohan";
        boolean areSame = sStudentName1.equalsIgnoreCase(sStudentName2);
        System.out.println("Rohan And rohan are equal with ignore case : " + areSame);

        String sAlphabet1 = "A";
        String sAlphabet2 = "C";
        int lnASCIIDiff   = sAlphabet1.compareTo(sAlphabet2);
        System.out.println("CompareTo : " + lnASCIIDiff);

        sAlphabet1 = "ROHAN";
        sAlphabet2 = "rohan";
        lnASCIIDiff = sAlphabet1.compareTo(sAlphabet2);
        System.out.println("CompareTo : " + lnASCIIDiff);


    }
}
