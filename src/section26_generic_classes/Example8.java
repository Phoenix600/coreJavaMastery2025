package section26_generic_classes;

class MyArrayTest<T extends Number>
{
    T[] data = (T[]) new Object[10];
    int index = 0;

    public void add(T t)
    {
        data[index++] = t;
    }
}


// 4. Bounded Type
public class Example8
{
    public static void main(String[] args)
    {
        MyArrayTest<Integer> instance1 = new MyArrayTest<>();
        MyArrayTest<Byte> instance2 = new MyArrayTest<>();
        MyArrayTest<Short> instance3 = new MyArrayTest<>();
        MyArrayTest<Long> instance4 = new MyArrayTest<>();
        MyArrayTest<Float> instance5 = new MyArrayTest<>();
        MyArrayTest<Double> instance6 = new MyArrayTest<>();
//        MyDummyArray<String> instance7 = new MyDummyArray<>();
    }
}
