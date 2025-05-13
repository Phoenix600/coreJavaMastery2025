package section26_generic_classes;

// 3. SubTypes
class MySuperType<T>
{
    T[] data = (T[]) new Object[3];
    int index = 0;

    public void add(T t)
    {
        data[index++] = t;
    }

    public T get(int position)
    {
        return data[position];
    }
}

// If Parent Class Generic Then SubClass becomes also Generic
class MySubType1 extends MySuperType
{

}

// If Parent Class Generic Then SubClass becomes also Generic
class MySubType2 extends MySuperType<String>
{

}

// When extending from generic class, othwerise mention the parameters
class MySubType3<T> extends MySuperType<T>
{

}


public class Example7
{
    public static void main(String[] args) {

        MySubType1 subType1 = new MySubType1();
        subType1.add("Pranay");
        subType1.add(17);
        subType1.add("Rajesh");

        // This treated as object
        MySubType2 mySubType2 = new MySubType2();
        mySubType2.add("Pranay");
        mySubType2.add("Diya");
        mySubType2.add("Tanvi");

        MySubType3<Integer> mySubType3 = new MySubType3();
        mySubType3.add(12);
        mySubType3.add(17);
        mySubType3.add(18);
    }
}
