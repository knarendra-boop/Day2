package org.example.Genrics;

public class GenaricImplementaion <T>{
    private T value;
    public void setValue(T value) {
        this.value= value;
    }
    public T getValue() {
        return value;
    }
}
class SingleGenaric {
    public static void main(String[] args) {


        GenaricImplementaion<String> g = new GenaricImplementaion<>();
        g.setValue("hello");
        System.out.println(g.getValue());
        GenaricImplementaion<Integer> ge = new GenaricImplementaion<>();
        ge.setValue(20);
        System.out.println(ge.getValue());

    }
}