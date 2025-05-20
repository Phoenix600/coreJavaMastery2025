package section26_generic_classes;

public class Example12
{
    static class MyDummyArray<T>
    {
        T data[] = (T[]) new Object[5];

        int index = 0;

        public void add(T t)
        {
            data[index++] = t;
        }

        public void display()
        {
            for(T t : data)
            {
                System.out.println(t);
            }
        }
    }

    class A{}
    class B extends A{}
    class C extends B{}

    // WildCard With Lower Bound
    static void fun(MyDummyArray<? super C> instance)
    {
        System.out.println(instance);
        instance.display();
    }

    public static void main(String[] args)
    {
        MyDummyArray<C> instance1 = new MyDummyArray<>();
        MyDummyArray<B> instance2 = new MyDummyArray<>();
        MyDummyArray<A> instance3 = new MyDummyArray<>();

        fun(instance1);
        fun(instance2);
        fun(instance3);
    }
}
