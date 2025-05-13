package section26_generic_classes;

interface MyA{}
class MyB implements MyA{}
class MyC implements MyA{}

class MySubTypeClassTest<T extends MyA>
{
    T data[] = (T[]) new Object[5];
    int index = 0;

    public void add(T t)
    {
        data[index++] = t;
    }
}

public class Example10
{
    public static void main(String[] args)
    {
        MySubTypeClassTest<MyA> mySubTypeClassTest = new MySubTypeClassTest<>();

        mySubTypeClassTest.add(new MyB());
        mySubTypeClassTest.add(new MyC());
        mySubTypeClassTest.add(new MyB());
        mySubTypeClassTest.add(new MyC());
    }
}
