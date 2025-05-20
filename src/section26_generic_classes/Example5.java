package section26_generic_classes;

/**
 * Bounds Of Generic
 * 1. No Parameters
 * 2. Multiple Parameters
 * 3. SubTypes
 * 4. Bounded Types
 */
class MyArray<T> {
 
	private T[] data = (T[]) new Object[10];

    public int len = 0;

    public void append(T t) {
        this.data[len] = t;
        len++;
    }

    public void display() {
        for (int i = 0; i < this.len; i++) {
            System.out.println(data[i]);
        }
    }
}

public class Example5 {
    public static void main(String[] args) {
        MyArray<String> stringMyArray = new MyArray<>();

        stringMyArray.append("Hi");
        stringMyArray.append("Bye");
        stringMyArray.append("Gm");
        stringMyArray.append("Gn");

        stringMyArray.display();

        MyArray<Integer> intArray = new MyArray<>();
        intArray.append(10);
        intArray.append(20);
        intArray.append(30);
        intArray.display();

        // 1. No Parameters
        // If Parameter are not given, it can hold any type of object
        System.out.println("If No Generic Parameter Are given");
        MyArray array = new MyArray();
        array.append("Data");
        array.append(12);
        array.append(12.12);
        array.display();

    }
}
