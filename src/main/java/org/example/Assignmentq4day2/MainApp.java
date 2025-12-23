package org.example.Assignmentq4day2;

public class MainApp {

    public static void main(String[] args) {

        InMemoryDataStore store = new InMemoryDataStore();

        store.users.put(1L, new User(1L, "Alice"));
        store.users.put(2L, new User(2L, "Bob"));

        System.out.println(store.users.get(1L));

        Transaction t1 = new Transaction("TXN1", 500);
        Transaction t2 = new Transaction("TXN2", 1000);

        store.transactions.add(t1);
        store.transactions.add(t2);

        store.transactionRefs.add(t1.reference);
        store.transactionRefs.add(t2.reference);

        for (int i = 0; i < store.transactions.size(); i++) {
            System.out.println(store.transactions.get(i));
        }
    }
}
