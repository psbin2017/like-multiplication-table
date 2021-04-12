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

    private class Node <T2> {
        private T2 data;
        private Node<T2> next;

        public Node(T2 data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);

        if ( last != null ) {
            node.next = last;
        }
        last = node;

        if ( isEmpty() ) {
            first = node;
        }
    }

    public T remove() {
        if ( isEmpty() ) {
            throw new NoSuchElementException("not element");
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
            throw new NoSuchElementException("not element");
        }
        return first.data;
    }

    private boolean isEmpty() {
        return first == null;
    }

}
