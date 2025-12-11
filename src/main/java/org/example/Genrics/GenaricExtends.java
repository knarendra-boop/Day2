package org.example.Genrics;

public class GenaricExtends {

    public <T extends Number> void showDouble(T value) {
        System.out.println("value: " + value);
        System.out.println("value: " + value.intValue());
    }
}
class extending {
    public static void main(String[] args) {
        GenaricExtends G = new GenaricExtends();
        G.showDouble(10);
    }
}
