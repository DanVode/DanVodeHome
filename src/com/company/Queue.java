package com.company;

public interface Queue<T> {
    void add(T item);
    T remove();

    boolean isEmpty();
}
