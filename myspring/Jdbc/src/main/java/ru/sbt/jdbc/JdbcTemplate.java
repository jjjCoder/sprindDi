package ru.sbt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Callable;

public class JdbcTemplate {
    private String url;

    public JdbcTemplate(String s) {
        url=s;
    }

    <T> T execute(JdbcAction<T> action ){
        try(Connection connection=openConnection()){
            return action.execute(connection);
        } catch (SQLException e) {
            throw new IllegalStateException();
        }
    }

    private Connection openConnection() throws SQLException {
           return DriverManager.getConnection(url);
    }

    public interface JdbcAction<T>{
        T execute(Connection connection) throws SQLException;
    }
}
