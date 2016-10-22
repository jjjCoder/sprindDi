package ru.sbt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }

    void createTable(){

    }

    User findByLogin(String login){
        return null;
    }

    boolean create(User user){
        return jdbcTemplate.execute(connection->{
            PreparedStatement statement=connection.prepareStatement("insert into user(");
            statement.setString(1, user.getLogin());
            statement.setString(2, user.getPasswordMd5());
            int result=statement.executeUpdate();
            return result==1;
        });
    }

    boolean update(User user){
        return false;
    }

    List<User> list(){
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
