package org.collections;


import java.util.Objects;

public class MyLinkedList<T> {
    private transient Node<T> first;
    private transient Node<T> last;
    private int size;

    /**
     * Adds the value to the end of the list.
     *
     * @param value value to add.
     */
    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (size == 0) {
            first = last = node;
        } else {
            node.prev = last;
            last.next = node;
            last = node;
        }

        size++;
    }

    /**
     * Removes the value from the list by specified index.
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
            Node<T> node = findByIndex(index);
            removedValue = node.element;
            if (node.next != null & node.prev != null) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }

            if (index == size - 1) {
                last = last.prev;
            }
        }

        size--;
        return removedValue;
    }

    /**
     * Removes all values from the list.
     */
    public void clear() {
        first = last = null;
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
        return findByIndex(index).element;
    }

    /**
     * Finds the Node instance by specified index.
     *
     * @param index of Node instance.
     * @return Node instance in which the list value is located.
     */
    private Node<T> findByIndex(int index) {
        Objects.checkIndex(index, size);

        Node<T> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }

        return node;
    }

    private static class Node<T> {
        T element;
        Node<T> prev;
        Node<T> next;

        Node(T element) {
            this.element = element;
        }
    }
}