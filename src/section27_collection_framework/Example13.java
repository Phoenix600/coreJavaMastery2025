package section27_collection_framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example13 {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        properties.put("port","8080");
        properties.put("username","root");
        properties.put("password","root");
        properties.put("db","mysql");
        properties.setProperty("vcs","git");

        System.out.println(properties);

        // saving properties to file
        properties.store(new FileOutputStream("C:\\Users\\PranayWin\\Downloads\\coreJavaMastery2025\\src\\collection_framework\\data\\data.txt"),"App.Properties");
        properties.storeToXML(new FileOutputStream("C:\\Users\\PranayWin\\Downloads\\coreJavaMastery2025\\src\\collection_framework\\data\\data.xml"),"App.Properties");

        // Reading Properties From Files In Java Program
        Properties prop = new Properties();
        prop.load(new FileInputStream("C:\\Users\\PranayWin\\Downloads\\coreJavaMastery2025\\src\\collection_framework\\data\\data.txt"));

        String data = prop.getProperty("password");
        System.out.println("DataBase Password : " + data);

        Properties xmlProperties = new Properties();
        xmlProperties.loadFromXML(new FileInputStream("C:\\Users\\PranayWin\\Downloads\\coreJavaMastery2025\\src\\collection_framework\\data\\data.xml"));
        data = xmlProperties.getProperty("vcs");
        System.out.println("VCS = " + data);



    }
}
