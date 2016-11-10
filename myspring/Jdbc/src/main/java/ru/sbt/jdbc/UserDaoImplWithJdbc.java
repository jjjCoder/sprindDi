package ru.sbt.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImplWithJdbc implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDaoImplWithJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public void createTable(){

    }

    @Override
    public Optional<Object> findByLogin(String login){
        return null;
    }

    @Override
    public boolean create(User user){
        return jdbcTemplate.execute(connection->{
            PreparedStatement statement=connection.prepareStatement("insert into user(");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPasswordMd5());
            int result=statement.executeUpdate();
            return result==1;
        });
    }

    @Override
    public boolean update(User user){
        return false;
    }

    @Override
    public List<User> list(){
        return jdbcTemplate.execute(connection->{
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select id, login, password_hash from user");
            List<User> users=new ArrayList<User>();
            while(resultSet.next()){
                User user=new User(
                        resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                );
                users.add(user);
            }
            return users;
        });
    }

    public static void main(String[] args) throws ClassNotFoundException {

    }
}
