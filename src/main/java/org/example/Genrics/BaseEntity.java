package org.example.Genrics;

import java.util.*;

public class BaseEntity {  // FIXED name

    private int id;

    public BaseEntity(int id) {  // FIXED constructor name
        this.id = id;
    }

    public int getId() {         // FIXED method name
        return id;
    }
}

interface Repository<T extends BaseEntity> {
    void save(T entity);
    T findById(int id);
    void delete(int id);
    void printAll();
}

class InMemoryRepository<T extends BaseEntity> implements Repository<T> {

    private List<T> storage = new ArrayList<>();

    @Override
    public void save(T entity) {
        storage.add(entity);
    }

    @Override
    public T  findById(int id) {
        for (T e : storage) {
            if (e.getId() == id) {   // now this works
                return e;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        storage.removeIf(e -> e.getId() == id);
    }

    @Override
    public void printAll() {
        for (T e : storage) {
            System.out.println(e);
        }
    }
}

class User extends BaseEntity {

    private String name;

    public User(int id, String name) {
        super(id);       // sends id to BaseEntity
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "'}";
    }
}


   class App {
    public static void main(String[] args) {

        InMemoryRepository<User> repo = new InMemoryRepository<>();

        repo.save(new User(1, "John"));
        repo.save(new User(2, "David"));
        repo.save(new User(3, "Mike"));

        System.out.println("All users:");
        repo.printAll();

        System.out.println("\nFind user with id 2:");
        System.out.println(repo.findById(2));

        System.out.println("\nDelete user with id 1");
        repo.delete(1);

        System.out.println("\nRemaining users:");
        repo.printAll();
    }
}


