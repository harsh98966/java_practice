package generic;

import java.util.ArrayList;
import java.util.List;

class Pair2<K, V extends Number & Comparable> implements Comparable<V>{
    private K key;
    private V value;

    public Pair2(K key, V value){
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

    public <T> void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(V value) {
        return this.value.compareTo(value);
    }
}
public class Compare_Generic {
    private static <T extends Number> double sum(List<T> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }
    public static void main(String[] args) {
        Pair2 p1 = new Pair2("Harsh", 55);
        Pair2 p2 = new Pair2("Vaibhav", 56);
        System.out.println(p1.compareTo(56));

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Harsh");
        arr.add("Vaibhav");
        testMethodNew(arr);
    }

    public static ArrayList<?> harsh(){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        return result;
    }
    public static <T> void testMethodNew(List<T> lst){
        for(Object ob : lst){
            System.out.println(ob);
        }


    }
}
