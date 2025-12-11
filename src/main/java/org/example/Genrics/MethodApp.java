package org.example.Genrics;

 class Methods {

    public <T> void Print(T item) {
        System.out.println(item);
    }
}

public class MethodApp {
    public static void main(String[] args) {
        Methods Methods = new Methods();
        Methods.Print(20);
        Methods.Print("hello");
    }
}
