package section27_collection_framework;

import java.util.BitSet;

///  BIt Set Example
public class Example15 {

    public static void main(String[] args) {

        BitSet bitSet1 = new BitSet();

        bitSet1.set(0);
        bitSet1.set(2);
        bitSet1.set(4);
        bitSet1.set(6);
        bitSet1.set(8);

        // print bitset
        System.out.println(bitSet1);

        BitSet bitSet2 = new BitSet();

        bitSet2.set(0);
        bitSet2.set(1);
        bitSet2.set(2);
        bitSet2.set(3);
        bitSet2.set(4);
        bitSet2.set(5);
        bitSet2.set(6);
        bitSet2.set(7);
        bitSet2.set(8);

        bitSet1.and(bitSet2);
        System.out.println("Bs1 AND BS2 = " + bitSet1);

        bitSet1.or(bitSet2);
        System.out.println("BS1 OR BS2 = " + bitSet1);

        bitSet1.xor(bitSet2);
        System.out.println("BS1 XOR BS2 =  " + bitSet1);

        bitSet1.flip(0,8);
        System.out.println("NOT BS1 = " + bitSet1);

    }
}
