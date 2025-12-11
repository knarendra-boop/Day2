package org.example;


import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate
        set.add("Mango");
        set.add("Banana"); // duplicate

        System.out.println(set); // Duplicate removed
        System.out.println("Size: " + set.size());
    }
}
