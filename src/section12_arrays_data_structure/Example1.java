package section12_arrays_data_structure;

/**
 * Topics To Be Covered:
 *  1. What is Array?
 *  2. How to create and access array
 *  3. for each loop
 *  ========================================================
 *  🚨 Key Pointer To Remember
 *  ========================================================
 *  1. An array is a collection of similar data elements.
 *  2. syntax:
 *         int[] nums = new int[5];
 *  ✅ In Java every array is an object.
 *  ✅ Every array in java is created inside heap memory.
 *  ✅ Every array object in java will have it's length as a property.
 *
 *
 */
public class Example1 {
    public static void main(String[] args) {

        // Creating Empty Array
        int[] nums = new int[5];
        System.out.println(nums.length);

        // Creating Array With
        int[] nums1 = {1,2,3,4};
        System.out.println(nums1.length);


    }
}
