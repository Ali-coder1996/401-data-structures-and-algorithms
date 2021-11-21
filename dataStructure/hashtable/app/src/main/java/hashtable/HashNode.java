package hashtable;

public class HashNode<K, V> {
    private V data;
    private K key;
    private HashNode<K, V> nextNode;
    private int hashCode;

    public HashNode() {
    }

    public HashNode(K key, V data, int hashCode) {
        this.data = data;
        this.key = key;
        this.hashCode = hashCode;
    }

    //Getters & Setters
    public int getHashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public V getData() {
        return data;
    }

    public void setData(V data) {
        this.data = data;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public HashNode<K, V> getNextNode() {
        return nextNode;
    }

    public void setNextNode(HashNode<K, V> nextNode) {
        this.nextNode = nextNode;
    }
}
