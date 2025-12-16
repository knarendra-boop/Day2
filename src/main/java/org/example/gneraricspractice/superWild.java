package org.example.gneraricspractice;

import java.util.ArrayList;
import java.util.List;

public class superWild {

    static void addInteger(List<? super Integer> item) {
        item.add(10);
        item.add(20);
    }
    public static void main(String[] args) {
        List<Integer> li1= new ArrayList<>();
        List<Number> li2 = new ArrayList<>();
        List<Object> li3 = new ArrayList<>();

        addInteger(li1);
        addInteger(li2);
        addInteger(li3);
        System.out.println(li1);
        System.out.println(li2);
        System.out.println(li3);
    }
}
