package ru.sbt.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.sbt.jdbc.User;
import ru.sbt.jdbc.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserDaoImplWithSpringJdbc implements UserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImplWithSpringJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createTable() {

    }

    @Override
    public Optional<Object> findByLogin(String login) {
        List<Map<String, Object>> userList = jdbcTemplate.queryForList("select * from user where login = " + login);
        if(userList.isEmpty()){
            return Optional.empty();
        }
        return null;
    }

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public List<User> list() {
        return null;
    }
}
