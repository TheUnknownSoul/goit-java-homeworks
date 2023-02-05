package org.collections;

import java.util.EmptyStackException;
import java.util.Objects;

public class MyStack<T> {
    private Node<T> top;
    private int size;

    /**
     * Adds the value to the top of the stack.
     * If the value is null it throws {@link NullPointerException}.
     *
     * @param value value to add.
     */
    public void push(T value) {
        Objects.requireNonNull(value);

        Node<T> node = new Node<>(value);
        if (top != null) {
            node.next = top;
        }

        top = node;
        size++;
    }

    /**
     * Removes the value from the stack by specified index.
     * If the index is out of stack bounds it throws {@link IndexOutOfBoundsException}.
     *
     * @param index index of value.
     * @return removed value.
     */
    public T remove(int index) {
        T removedValue;

        if (index == size - 1 && size > 0) {
            removedValue = top.element;
            top = top.next;
        } else {
            Node<T> node = findByIndex(index);
            removedValue = node.next.element;
            node.next = node.next.next;
        }

        size--;
        return removedValue;
    }

    /**
     * Removes all values from the stack.
     */
    public void clear() {
        top = null;
        size = 0;
    }

    /**
     * Returns the size of the stack.
     *
     * @return number of values in the stack.
     */
    public int size() {
        return size;
    }

    /**
     * Returns the value from the top of the stack.
     *
     * @return top value of the stack.
     * @throws EmptyStackException if stack is empty.
     */
    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.element;
    }

    /**
     * Retrieves and removes the value from the top of the stack.
     *
     * @return top value of the stack.
     * @throws EmptyStackException if stack is empty.
     */
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T element = top.element;
        top = top.next;
        size--;
        return element;
    }

    /*
     * Finds the Node instance by specified index.
     * If the index is out of stack bounds it throws {@link IndexOutOfBoundsException}.
     *
     * @param index of Node instance.
     * @return Node instance in which the value of the stack is located.
     */
    private Node<T> findByIndex(int index) {
        Objects.checkIndex(index, size);

        Node<T> node = top;
        for (int i = 0; i < size - index; i++) {
            node = node.next;
        }

        return node;
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
        }
    }
}
