package ru.sbt.jdbc;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void createTable();

    Optional<Object> findByLogin(String login);

    boolean create(User user);

    boolean update(User user);

    List<User> list();
}
