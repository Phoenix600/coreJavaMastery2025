package section27_collection_framework;

import java.util.Arrays;
import java.util.Comparator;

///  Example On Arrays And Comparator
public class Example16 {
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = {1,2,3,4,5,6,7,8,9,10};

        int result = Arrays.compare(a,b);
        if(result == 0)
        {
            System.out.println("Arrays are equal : ");
        }
        else if(result == 1)
        {
            System.out.println("Array-1 is larger");
        }
        else if(result == -1)
        {
            System.out.println("Array-2 is larger");
        }

        // Creating the copy of array
        System.out.println("Creating the copy of array : ");
        int c[] = Arrays.copyOf(a,5); // copying only 5 elements
        for (int x: c)
        {
            System.out.println(x);
        }

        System.out.println("Filling Array with 10s : ");
        // filling array with 10s with all locations in array
        Arrays.fill(c,10);
        for (int x: c)
        {
            System.out.println(x);
        }

        Integer numbers[] =  {78,45,67,9,-34,7,45,4,3,2,1};
        Arrays.sort(numbers);

        System.out.println("Sorting Numbers : ");
        for (int x: numbers)
        {
            System.out.println(x);
        }

        // For Sorting Comparison Is Required

        int foundIndex = Arrays.binarySearch(numbers,7);
        System.out.println("7 Found At Index : " + foundIndex);

        System.out.println("Working With Comparator : ");
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2)
                {
                    return -1;
                }
                else if(o1 < o2)
                {
                    return 1;
                }

                return 0;
            }
        };

        Arrays.sort(numbers,comparator);
        for (int x: numbers)
        {
            System.out.println(x);
        }
    }
}
