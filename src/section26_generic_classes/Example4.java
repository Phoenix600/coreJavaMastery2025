package section26_generic_classes;

// Defining Generic Class
// This will hold any type of data
class MyData<T>
{
    private T data;

    public void setData(T t)
    {
        this.data = t;
    }

    public T getData()
    {
        return  this.data;
    }
}

public class Example4
{
    public static void main(String[] args)
    {
        MyData<Integer> d = new MyData<>();

        d.setData(10);
        System.out.println("data : " + d.getData());

        MyData<String> d1 = new MyData<>();
        d1.setData("Core Java");
        System.out.println("data : " + d1.getData());

    }
}
