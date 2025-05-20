package section26_generic_classes;

// Multiple Parameters Are Allowed.
// 2. Multiple Parameters
class MyPair<K,V>
{
    private K key;
    private V value;

    public MyPair(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
public class Example6
{
    public static void main(String[] args) {
        MyPair<Integer, String > pair = new MyPair<>(1,"Mysore Dosa");

        System.out.println("KEY : " + pair.getKey());
        System.out.println("VALUE : " + pair.getValue());
    }
}
