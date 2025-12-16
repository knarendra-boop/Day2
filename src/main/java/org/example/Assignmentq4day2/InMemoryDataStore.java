package org.example.Assignmentq4day2;



import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
class InMemoryDataStore {

    // Map<Long, User> for user storage with ID-based lookup
    Map<Long, User> users = new HashMap<>();

    // List<Transaction> for transaction history
    List<Transaction> transactions = new ArrayList<>();

    // Set<String> for unique transaction reference tracking
    Set<String> transactionRefs = new HashSet<>();
}

