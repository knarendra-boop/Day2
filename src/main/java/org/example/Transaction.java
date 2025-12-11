package org.example;


// Transactable interface
interface Transactable {
    void credit(double amount);
    void debit(double amount);
    void transfer(double amount);
}

// Auditable interface
interface Auditable {
    void log(String message);
    void track();
}

// Wallet class implementing both interfaces
class Wallet implements Transactable, Auditable {

    private double balance;

    @Override
    public void credit(double amount) {
        balance += amount;
    }

    @Override
    public void debit(double amount) {
        balance -= amount;
    }

    @Override
    public void transfer(double amount) {
        balance -= amount;
    }

    @Override
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    @Override
    public void track() {
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class Transaction {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();

        wallet.credit(1000);
        wallet.debit(200);
        wallet.transfer(300);

        wallet.log("Transaction completed");
        wallet.track();
    }
}