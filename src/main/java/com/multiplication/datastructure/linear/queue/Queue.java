package com.multiplication.datastructure.linear.queue;

import java.util.NoSuchElementException;

/**
 * 큐
 *
 * First In First Out (먼저 들어온 값이 먼저 나간다.)
 */
public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    private class Node<S> {
        private S data;
        private Node<S> next;

        public Node(S data) {
            this.data = data;
        }
    }

    public void add(T item) {
        Node<T> node = new Node<>(item);

        if ( last != null ) {
            last.next = node;
        }

        last = node;

        if ( isEmpty() ) {
            first = node;
        }
    }

    public T remove() {
        if ( isEmpty() ) {
            throw new NoSuchElementException("not elements");
        }

        T data = first.data;
        first = first.next;
        if ( isEmpty() ) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if ( isEmpty() ) {
            throw new NoSuchElementException("not elements");
        }

        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
