package org.example.Assignmentq1day2;

public interface Transactable {
    void credit(double amount);
    void debit(double amount);
    void transfer(Wallet toWallet, double amount);
}
