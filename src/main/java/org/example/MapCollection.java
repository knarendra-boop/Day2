package org.example;

import java.util.*;

class User {
    long id;
    String name;

    User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Transactions {
    String reference;
    double amount;

    Transactions(String reference, double amount) {
        this.reference = reference;
        this.amount = amount;
    }
}

 class DataStoreExample {

    public static void main(String[] args) {

        User u1 = new User(1L, "John");
        User u2 = new User(2L, "David");
        User u3 = new User(3L, "Mike");

        Map<Long, User> userMap = new HashMap<>();
        userMap.put(u1.id, u1);
        userMap.put(u2.id, u2);
        userMap.put(u3.id, u3);

        System.out.println("Users:");
        for (Map.Entry<Long, User> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().name);
        }



        Transactions t1 = new Transactions("TXN1001", 500.0);
        Transactions t2 = new Transactions("TXN1002", 1200.5);

        List<Transactions> transactionList = new ArrayList<>();
        transactionList.add(t1);
        transactionList.add(t2);

        System.out.println("\nTransaction History:");
        for (Transactions t : transactionList) {
            System.out.println(t.reference + " -> " + t.amount);
        }



        String r1 = "TXN1001";
        String r2 = "TXN1002";
        String r3 = "TXN1001"; // duplicate

        Set<String> referenceSet = new HashSet<>();
        referenceSet.add(r1);
        referenceSet.add(r2);
        referenceSet.add(r3);  // ignored because duplicate

        System.out.println("\nUnique References:");
        for (String ref : referenceSet) {
            System.out.println(ref);
        }
    }
}
