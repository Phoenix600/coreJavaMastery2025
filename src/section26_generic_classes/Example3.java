package section26_generic_classes;

public class Example3<T> {

    T data[] =  (T[]) new Object[3];

    public static void main(String[] args) {

        Example3<String> instance = new Example3<>();
        instance.data[0] = "Hi";
        instance.data[1] = "Bye";
//        instance.data[2] = 1212;
        for (String s : instance.data)
        {
            System.out.println("Data : " + s);
        }
    }
}
