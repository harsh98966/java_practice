package generic;
// by extending the generic type V we are bounding it to be
// a type of Number only
// any class extending number can be used.
class Pair<K, V extends Number>{
    private K key;
    private V value;

    public Pair(K key, V value){
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
}
public class Key_Value_Generic {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Harsh", 1);
        System.out.println(pair);

    }
}
