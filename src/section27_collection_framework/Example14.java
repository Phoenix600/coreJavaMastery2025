package section27_collection_framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Example Of String Tokenizer
public class Example14 {
    public static void main(String[] args) throws IOException {

        String data = "name=rajesh;address=nagpur;country=india;dept=dev";

        StringTokenizer stk = new StringTokenizer(data,"=;");

        int token = stk.countTokens();
        System.out.println("Tokens : " + token);

        String s;

        while (stk.hasMoreTokens())
        {
            s = stk.nextToken();
            System.out.println(s);
        }

        data = "name=rajesh address=nagpur country=india dept=dev";
        stk  = new StringTokenizer(data,"= ");

        while (stk.hasMoreTokens())
        {
            s = stk.nextToken();
            System.out.println(s);
        }

        FileInputStream fis = new FileInputStream("C:\\Users\\PranayWin\\Downloads\\coreJavaMastery2025\\src\\collection_framework\\data\\student.txt");
        byte[] bytes = new byte[fis.available()];
        bytes = fis.readAllBytes();

        stk = new StringTokenizer(new String(bytes),"=");

        while (stk.hasMoreTokens())
        {
            s = stk.nextToken();
            System.out.println(s);
        }

        fis = new FileInputStream("C:\\Users\\PranayWin\\Downloads\\coreJavaMastery2025\\src\\collection_framework\\data\\nums.txt");

        bytes = new byte[fis.available()];
        bytes = fis.readAllBytes();

        data = new String(bytes);

        stk = new StringTokenizer(data,",");

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (stk.hasMoreTokens())
        {
            s = stk.nextToken();
            arrayList.add(Integer.valueOf(s));
        }
        System.out.println(arrayList);

    }
}
