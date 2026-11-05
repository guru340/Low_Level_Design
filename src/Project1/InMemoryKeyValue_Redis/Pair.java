package Project1.InMemoryKeyValue_Redis;

public class Pair<K ,V> {

    private final K k;

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    private final V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }
}
