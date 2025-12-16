package org.example.Assignmentq3day2;


public interface Repository<T extends BaseEntity> {

    void save(T entity);

    T findById(long id);

    void delete(long id);

    void update(T entity);
}


