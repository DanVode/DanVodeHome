package com.company;

public interface Stack<T> {
    void push(T item);
    T pop();

    boolean isEmpty();
}
