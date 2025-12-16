package org.example.Assignmentq4day2;

import java.util.HashSet;
class Set {
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
