package org.example.Assignmentq3day2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InMemoryRepository<T extends BaseEntity>
        implements Repository<T> {

    private List<T> storage = new ArrayList<>();

    @Override
    public void save(T entity) {
        storage.add(entity);
    }

    @Override
    public T findById(long id) {
        for (int i = 0; i < storage.size(); i++) {
            T e = storage.get(i);
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Iterator<T> it = storage.iterator();
        while (it.hasNext()) {
            T e = it.next();
            if (e.getId() == id) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public void update(T entity) {
        delete(entity.getId());
        save(entity);
    }
}
