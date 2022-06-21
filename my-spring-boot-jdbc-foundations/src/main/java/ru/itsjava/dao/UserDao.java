package ru.itsjava.dao;

import ru.itsjava.domain.User;

public interface UserDao {

    int count();

    void insert(User user);

    void update(User user);

    void delete(User user);

    User findById(long id);

    User findByname(String name);
}

