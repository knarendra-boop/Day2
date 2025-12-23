package org.example.Assignmentq4day2;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class InMemoryDataStore {

    Map<Long, User> users = new HashMap<>();
    List<Transaction> transactions = new ArrayList<>();
    Set<String> transactionRefs = new HashSet<>();
}
