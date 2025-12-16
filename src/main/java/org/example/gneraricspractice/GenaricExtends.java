package org.example.gneraricspractice;

public class GenaricExtends {

    public <T extends Number> void showDouble(T value) {
        System.out.println("value: " + value);
        System.out.println("value: " + value.intValue());
    }
}
