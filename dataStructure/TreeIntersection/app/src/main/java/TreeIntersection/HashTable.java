package TreeIntersection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable<K, V> {

    private ArrayList<HashNode<K, V>> hashTableBuckets;
    private int bucketsNumber;
    private int size;

    public HashTable() {
         List<K> keys = new ArrayList<>();

        hashTableBuckets = new ArrayList<>();
        bucketsNumber = 50;
        size = 0;
        for (int index = 0; index < bucketsNumber; index++) {
            hashTableBuckets.add(null);
        }
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    private int hash(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % bucketsNumber;
        return Math.abs(index);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (getSize() == 0);
    }


    public boolean contains(K key) {
        return get(key) != null;
    }

    public void add(K key, V value) {

        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = hashTableBuckets.get(bucketIndex);

        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                head.setData(value);
                return;
            }
            head = head.getNextNode();
        }
        size++;
        head = hashTableBuckets.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.setNextNode(head);
        hashTableBuckets.set(bucketIndex, newNode);

        // increase the table size
        if ((1.0 * size) / bucketsNumber >= 0.7) {
            ArrayList<HashNode<K, V>> temp = hashTableBuckets;
            hashTableBuckets = new ArrayList<>();
            bucketsNumber = 2 * bucketsNumber;
            size = 0;

            for (int index = 0; index < bucketsNumber; index++) {
                hashTableBuckets.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.getKey(), headNode.getData());
                    headNode = headNode.getNextNode();
                }
            }
        }
    }

    public V remove(K key) {
        // Apply hash function to find index for given key
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);
        // Get head of chain
        HashNode<K, V> head = hashTableBuckets.get(bucketIndex);

        // Search for key in its linked list
        HashNode<K, V> prev = null;
        while (head != null) {
            // If Key found
            if (head.getKey().equals(key) && hashCode == head.getHashCode())
                break;

            // Else keep moving in chain
            prev = head;
            head = head.getNextNode();
        }

        // If key was not there
        if (head == null)
            return null;

        // Reduce size
        size--;

        // Remove key
        if (prev != null)
            prev.setNextNode(head.getNextNode());
        else
            hashTableBuckets.set(bucketIndex, head.getNextNode());

        return head.getData();
    }


    public V get(K key) {
        int bucketIndex = hash(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = hashTableBuckets.get(bucketIndex);

        // search the linnked list
        while (head != null) {
            if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
                return head.getData();
            }

            head = head.getNextNode();
        }

        // key not found
        return null;
    }
    private List<K> keys = new ArrayList<>();
    public List<K> getKeys() {
        return keys;
    }


}
