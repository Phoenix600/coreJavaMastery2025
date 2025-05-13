package section26_generic_classes;

/**
 * Generic Methods
 * 1. Generic Methods
 * 2. WildCard
 * 3. Lower Bound
 * 4. Upper Bound
 */

class MyArrayClass<T>
{
    T A[] = (T[]) new Object[10];
    int length = 0;

    public void append(T value)
    {
        A[length++] = value;
    }

    public void display()
    {
        for (T t : A)
        {
            System.out.println(t);
        }
    }
}
public class Example11
{
    // 1. Example Of Generic Methods
    // Before Return Type We Have TO Define The Generic Type
    static <E> void show(E[] list)
    {
        for (E target : list)
        {
            System.out.println(target);
        }
    }

    // Generic Methods With Bound Type
    static <E extends Number> void display(E...list)
    {
        for (E target : list)
        {
            System.out.println(target);
        }
    }

    // WildCards are used in Parameter List With Upper Bound
    static void fun(MyArrayClass<? extends Number> obj)
    {
        obj.display();
    }

    public static void main(String[] args)
    {
        System.out.println("Generic Method For String : ");
        show(new String[]{"Hello","World","Java","Is","Great"});

        System.out.println("Generic Method For Integers : ");
        show(new Integer[]{17,12,18,20,22});

        System.out.println("Generic Method With Bound Type");

        System.out.println("Generic Method For Integers : ");
        display(17,12,20,10,1);

        System.out.println("Generic Method For Integers : ");
        display(17.17,20.20,12.12);

//        display("Pranay R", "Diya G","Surshti S","Tanvi W");

        MyArrayClass<String> instance1 = new MyArrayClass<>();
        instance1.append("Hi");
        instance1.append("Bye");

        MyArrayClass<Integer> instance2 = new MyArrayClass<>();
        instance2.append(10);
        instance2.append(20);

//        fun(instance1);  // This Throws As Error
        fun(instance2);
    }
}
