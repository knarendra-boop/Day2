package org.example.Assignmentq4day2;

class User {
    long id;
    String name;

    User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}
