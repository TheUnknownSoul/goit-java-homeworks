package org.collections;



import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] values;
    private int size;

    /**
     * Creates an instance of the class with the default list capacity.
     */
    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an instance of the class with the specified list capacity.
     *
     * @param capacity the capacity of the list.
     * @throws IllegalArgumentException if the specified capacity is less or equal to 0.
     */
    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        values =  new Object[capacity];
    }

    /**
     * Adds the value to the end of the list.
     *
     * @param value value to add.
     */
    public void add(T value) {
        if (size == values.length) {
            int newCapacity = (int) (values.length * 1.5 + 1);
            values = Arrays.copyOf(values, newCapacity);
        }
        values[size++] = value;
    }

    /**
     * Removes the value from the list by specified index.
     * If the index is out of list bounds it throws {@link IndexOutOfBoundsException}.
     *
     * @param index index of value.
     * @return removed value.
     */
    public T remove(int index) {
        Objects.checkIndex(index, size);
        //noinspection unchecked
        T removedValue = (T) values[index];
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        values[size - 1] = null;
        size--;
        return removedValue;
    }

    /**
     * Removes all values from the list.
     */
    public void clear() {
        values = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Returns the size of the list.
     *
     * @return number of values in the list.
     */
    public int size() {
        return size;
    }

    /**
     * Returns the value from the list by specified index.
     * If the index is out of list bounds it throws {@link IndexOutOfBoundsException}.
     *
     * @param index index of value.
     * @return value.
     */
    public T get(int index) {
        Objects.checkIndex(index, size);
        //noinspection unchecked
        return (T) values[index];
    }
}