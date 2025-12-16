package org.example.Assignmentq4day2;

 class Transaction {
    String reference;
    double amount;

    public Transaction(String reference, double amount) {
        this.reference = reference;
        this.amount = amount;
    }

    public String toString() {
        return reference + " : " + amount;
    }
}
