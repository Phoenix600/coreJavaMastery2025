package section27_collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Example11 {
    public static void main(String[] args) {
        // LinkedHashMap Vs LinkedHashSet
        // Here we insert only values and not key-value
        // Maintain the order of insertion of values
        // you can not set the limit like LinkedHashMap
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(5,0.75f);

        linkedHashSet.add("A");
        linkedHashSet.add("C");
        linkedHashSet.add("E");
        linkedHashSet.add("B");
        linkedHashSet.add("G");
        linkedHashSet.add("A");

        System.out.println("LinkedHash Set : ");
        linkedHashSet.forEach((value)-> System.out.println(value));

        // Hash Set
        HashSet<String> hashSet = new HashSet<String>(5,0.75f);

        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("E");
        hashSet.add("B");
        hashSet.add("G");
        hashSet.add("A");

        System.out.println("Hash Set : ");
        hashSet.forEach((value)-> System.out.println(value));

    }
}
