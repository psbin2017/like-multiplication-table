package com.multiplication.datastructure.linear.stack;

import java.util.NoSuchElementException;

/**
 * 스택
 *
 * Last In First Out (마지막에 들어온 게 첫번째로 나간다)
 */
public class Stack <T> {

    private Node<T> top;

    private class Node <T2> {
        private final T2 data;
        private Node<T2> next;

        public Node(T2 data) {
            this.data = data;
        }
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);

        if ( top != null ) {
            node.next = top;
        }
        top = node;
    }

    public T pop() {
        if ( isEmpty() ) {
            throw new NoSuchElementException("not element");
        }

        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if ( isEmpty() ) {
            throw new NoSuchElementException("not element");
        }

        return top.data;
    }

    private boolean isEmpty() {
        return top == null;
    }
}
