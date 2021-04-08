package com.multiplication.datastructure.linear.stack;

import java.util.NoSuchElementException;

/**
 * 스택
 *
 * Last In First Out (마지막에 들어온 게 첫번째로 나간다)
 */
public class Stack <T> {

    private Node<T> top;

    private class Node<S> {
        private S data;
        private Node<S> next;

        public Node(S data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> node = new Node<>(item);

        if ( top != null ) {
            node.next = top;
        }

        top = node;
    }

    public T pop() {
        if ( isEmpty() ) {
            throw new NoSuchElementException("not elements");
        }

        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if ( isEmpty() ) {
            throw new NoSuchElementException("not elements");
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
