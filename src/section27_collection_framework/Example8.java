package section27_collection_framework;

import java.util.Map.Entry;

import java.util.TreeMap;

///  Tree Map Example
public class Example8 {
    public static void main(String[] args) {
        // Key-Value pairs are stored in sorted order
        // guaranteed log(n) time for add, remove and contains operation

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1,"Pranay Ramteke");
        treeMap.put(2,"Rekha Bachchan");
        treeMap.put(3,"Aishwarya Oberoi");
        treeMap.put(4,"Katrina Khan");
        treeMap.put(5,"Disha Shorff");
        treeMap.put(6,"Giorgia Modi");

        System.out.println(treeMap);

        Boolean isPresent =  treeMap.containsKey(3);
        System.out.println("Key 3 is present : " + isPresent);

        String value = treeMap.get(3);
        System.out.println("Value for Key 3 : " + value);

        Entry<Integer, String> entry = treeMap.firstEntry();
        System.out.println("Record : " + entry.getKey() + "..." + entry.getValue());

        entry = treeMap.lastEntry();
        System.out.println("Last Record : " + entry.getKey() + "..." + entry.getValue());



    }
}
