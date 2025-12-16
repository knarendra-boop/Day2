package org.example.Assignmentq5day2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListAllOperationsBeginner {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // 1. ADD ELEMENTS

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("Initial:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 2. ADD AT BEGINNING
        arrayList.add(0, 5); // slow for arraylist
        linkedList.addFirst(5); // fast for linkedlist

        System.out.println("\nAfter adding at beginning:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 3. ADD IN MIDDLE (index 2)
        arrayList.add(2, 15);
        linkedList.add(2, 15);

        System.out.println("\nAfter adding at index 2:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 4. GET ELEMENT (index 3)
        System.out.println("\nGet element at index 3:");
        System.out.println("ArrayList get(3): " + arrayList.get(3));
        System.out.println("LinkedList get(3): " + linkedList.get(3));

        // 5. REMOVE FROM BEGINNING
        arrayList.remove(0);
        linkedList.removeFirst();

        System.out.println("\nAfter removing beginning:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);


        // 6. REMOVE FROM MIDDLE (index 2)

        arrayList.remove(2);
        linkedList.remove(2);

        System.out.println("\nAfter removing index 2:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);


        // 7. REMOVE FROM END

        arrayList.remove(arrayList.size() - 1);
        linkedList.removeLast();

        System.out.println("\nAfter removing last element:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
