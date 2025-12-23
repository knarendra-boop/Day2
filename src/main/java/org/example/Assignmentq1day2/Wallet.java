package org.example.Assignmentq1day2;

import java.util.ArrayList;
import java.util.List;

public class Wallet implements Transactable, Auditable {

    private double balance;
    private List<String> logs = new ArrayList<>();

    @Override
    public void credit(double amount) {
        balance += amount;
        log("Credited " + amount);
    }

    @Override
    public void debit(double amount) {
        balance -= amount;
        log("Debited " + amount);
    }

    @Override
    public void transfer(Wallet toWallet, double amount) {
        this.debit(amount);
        toWallet.credit(amount);
        log("Transferred " + amount);
    }

    @Override
    public void log(String message) {
        logs.add(message);
    }

    @Override
    public void track() {
        for (String log : logs) {
            System.out.println(log);
        }
    }


        public static void main(String[] args) {
            Wallet w1 = new Wallet();
            Wallet w2 = new Wallet();

            w1.credit(1000);
            w1.debit(200);
            w1.transfer(w2, 300);

            w1.track();
        }
    }

