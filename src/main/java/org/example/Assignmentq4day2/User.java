package org.example.Assignmentq4day2;

public class User {
    long id;
    String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

