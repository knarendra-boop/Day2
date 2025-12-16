package org.example.Assignmentq3day2;

public class MainApp {

    public static void main(String[] args) {

        InMemoryRepository<User> repo = new InMemoryRepository<>();

        User u1 = new User(1, "Alice");
        User u2 = new User(2, "Bob");

        repo.save(u1);
        repo.save(u2);

        System.out.println(repo.findById(1));

        repo.delete(2);

        repo.update(new User(1, "Alice Updated"));
    }
}
