package section27_collection_framework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.function.Function;

public class Example12 {
    public static void main(String[] args) {

        Hashtable<Integer,String> hTable = new Hashtable<>();
        hTable.put(17,"Pranay");
        hTable.put(10,"Lakshman");
        hTable.put(12,"Gopal");
        hTable.put(18,"Lucky");

        // accessing by keys
        String value =  hTable.get(13);
        System.out.println("Value For Key 13 : " + value);

        // Using Keys And Values at Same Time
        hTable.forEach(((integer, s) -> System.out.println(integer + "..." + s)));

        // Using Keys
        Enumeration<Integer> eKeys = hTable.keys();
        System.out.println("Enumeration Keys Of HTable : ");
        while (eKeys.hasMoreElements())
        {
            System.out.println(eKeys.nextElement());
        }

        // Using Values
        Enumeration<String> eValues = hTable.elements();
        System.out.println("Enumeration Values Of HTable : ");
        while (eValues.hasMoreElements())
        {
            System.out.println(eValues.nextElement());
        }

        hTable.compute(17,(k,v)->v+="Diya");

        Function<Integer, String> mapperFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return "Data-"+integer;
            }
        };

        hTable.computeIfAbsent(7,mapperFunction);
        hTable.computeIfAbsent(7,(k)->k+"data");

        System.out.println(hTable);
    }
}
