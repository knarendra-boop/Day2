package org.example;


import java.util.*;

public class MapTest {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();

        hm.put(20, "A");
        hm.put(5, "B");
        hm.put(15, "C");

        tm.put(20, "A");
        tm.put(5, "B");
        tm.put(15, "C");

        System.out.println("HashMap:");
        System.out.println(hm); // random order

        System.out.println("TreeMap:");
        System.out.println(tm); // sorted order
    }
}


