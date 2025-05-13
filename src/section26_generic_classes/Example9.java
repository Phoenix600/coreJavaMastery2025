package section26_generic_classes;

class A{}
class B extends A{}
class C extends A{}

class MySubTypeClass<T extends A>
{
    T data[] = (T[]) new Object[5];
    int index = 0;

    public void add(T t)
    {
        data[index++] = t;
    }
}

public class Example9
{
    public static void main(String[] args)
    {
        MySubTypeClass<A> mySubTypeClass = new MySubTypeClass<>();

        mySubTypeClass.add(new A());
        mySubTypeClass.add(new B());
        mySubTypeClass.add(new C());
    }
}
