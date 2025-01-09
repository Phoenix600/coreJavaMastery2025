package section27_collection_framework.model;

import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        // Key-Value pairs are stored in sorted order
        // guaranteed log(n) time for add, remove and contains operation

        HashMap<Integer, String> treeMap = new HashMap<>();

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


    }
}
