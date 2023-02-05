package org.collections;


public class MyHashMap<K, V> {
    private final static int DEFAULT_CAPACITY = 16;
    private Node<K, V>[] table;
    private int size;

    /**
     * Creates an instance of the class with the default capacity.
     */
    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an instance of the class with the specified capacity.
     *
     * @param capacity the capacity of the list.
     * @throws IllegalArgumentException if the specified capacity is less or equal to 0.
     */
    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        this.table = new Node[capacity];
    }

    /**
     * Adds key and value to the map.
     * The value will be overwritten if the map already contains the specified key.
     *
     * @param key   identifier with which the value is mapped.
     * @param value value to add.
     * @return null or the old value if the map already had the specified key.
     */
    public V put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> node = table[index];
        Node<K, V> newNode = new Node<>(key, value);

        if (node == null) {
            table[index] = newNode;
        } else {
            Node<K, V> prev = node;
            while (node != null) {
                if (key == null || node.key.equals(key)) {
                    V prevValue = node.value;
                    node.value = value;
                    return prevValue;
                }
                prev = node;
                node = node.next;
            }
            prev.next = newNode;
        }

        size++;
        return null;
    }

    /**
     * Removes a value by its key and returns the removed value
     * or null if the map does not contain such key.
     *
     * @param key identifier with which the value is mapped.
     * @return removed value.
     */
    public V remove(K key) {
        int index = getIndex(key);
        Node<K, V> node = table[index];

        if (node != null) {
            if (key == null || node.key.equals(key)) {
                table[index] = node.next;
                size--;
                return node.value;
            }
            while (node.next != null) {
                if (node.next.key.equals(key)) {
                    node.next = node.next.next;
                    size--;
                    return node.next.value;
                }
                node = node.next;
            }
        }

        return null;
    }

    /**
     * Removes all values from the map.
     */
    @SuppressWarnings("unchecked")
    public void clear() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Returns the size of the map.
     *
     * @return number of values in the map.
     */
    public int size() {
        return size;
    }

    /**
     * Retrieves the value by the specified key.
     *
     * @param key identifier with which the value is mapped.
     * @return the value stored in the table by the given key or null if the key is not found.
     */
    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> node = table[index];

        while (node != null) {
            if (key == null || node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }

        return null;
    }

    /**
     * Calculates the hashcode of the key and specifies the table cell
     * where the key with the value will be stored.
     *
     * @param key identifier with which the value is mapped.
     * @return index of the table cell into which the key with the value will be stored.
     */
    private int getIndex(K key) {
        return key == null ? 0 : key.hashCode() % table.length;
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
