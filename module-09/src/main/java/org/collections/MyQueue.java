package org.collections;


import java.util.Objects;

public class MyQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    /**
     * Adds the value to the end of the queue.
     *
     * @param value value to add.
     */
    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (size == 0) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }

        size++;
    }

    /**
     * Removes the value from the queue by specified index.
     * If the index is out of queue bounds it throws {@link IndexOutOfBoundsException}.
     *
     * @param index index of value.
     * @return removed value.
     */
    public T remove(int index) {
        T removedValue;

        if (index == 0 && size > 0) {
            removedValue = first.element;
            first = first.next;

            if (first == null) {
                last = null;
            }
        } else {
            Node<T> node = findByIndex(index - 1);
            removedValue = node.next.element;
            node.next = node.next.next;

            if (index == size - 1) {
                last = node;
            }
        }

        size--;
        return removedValue;
    }

    /**
     * Removes all values from the queue.
     */
    public void clear() {
        first = last = null;
        size = 0;
    }

    /**
     * Returns the size of the queue.
     *
     * @return number of values in the queue.
     */
    public int size() {
        return size;
    }

    /**
     * Returns the first value of the queue.
     *
     * @return first value of the queue or null if queue is empty.
     */
    public T peek() {
        return first != null ? first.element : null;
    }

    /**
     * Retrieves and removes the first value of the queue.
     *
     * @return first value of the queue or null if queue is empty.
     */
    public T poll() {
        if (first == null) {
            return null;
        }

        T element = first.element;
        first = first.next;

        if (first == null) {
            last = null;
        }

        size--;
        return element;
    }

    /*
     * Finds the Node instance by specified index.
     * If the index is out of queue bounds it throws {@link IndexOutOfBoundsException}.
     *
     * @param index of Node instance.
     * @return Node instance in which the value of the queue is located.
     */
    private Node<T> findByIndex(int index) {
        Objects.checkIndex(index, size);

        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
        }
    }
}
