package section27_collection_framework;


import java.util.LinkedHashMap;
import java.util.Map;

// Using LinkedHashMap as Cache
public class Example10 {
    public static void main(String[] args) {
        int initialCapacity = 5;
        LinkedHashMap<Integer, String > lHashMap = new LinkedHashMap<>(initialCapacity,0.75f,true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return this.size() > initialCapacity;
            }
        };

        lHashMap.put(1,"A");
        lHashMap.put(2,"B");
        lHashMap.put(3,"C");
        lHashMap.put(4,"D");
        lHashMap.put(5,"E");

        System.out.println("Before Accessing  : ");
        lHashMap.forEach((k,v)-> System.out.println(k + "..." + v));

        String s = lHashMap.get(5);
        s = lHashMap.get(2);
        s = lHashMap.get(1);

        System.out.println("After Accessing : ");
        lHashMap.forEach((k,v)-> System.out.println(k + "..." + v));


        lHashMap.put(6,"F");
        lHashMap.put(9,"G");

        System.out.println("After Going Beyond Loading Factor : ");
        lHashMap.forEach((k,v)-> System.out.println(k + "..." + v));



    }
}