package org.example.gneraricspractice;

public class GenaricImplementaion<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
