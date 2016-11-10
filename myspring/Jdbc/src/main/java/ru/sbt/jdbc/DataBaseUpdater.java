package ru.sbt.jdbc;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUpdater {
    public static void main(String[] args) throws SQLException {
        new DataBaseUpdater().executeScript("file://C:/Users/SBTJavastudent/IdeaProjects/multithreading/myspring/Jdbc/src/main/sql/user.sql/");

    }
    public void executeScript(String fileName){
        try{
            FileUtils.readFileToString(Paths.get(new URI(fileName)).toFile());
            String sqlScript= Paths.get(new URI(fileName)).toString();
            executeSql(sqlScript);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeSql(String sql) throws SQLException {
        try(Connection connection=DriverManager.getConnection("jdbc:h2:C:/Users/SBTJavastudent/IdeaProjects/multithreading/myspring/Jdbc/database");
            Statement statement=connection.createStatement()){

            boolean execute=statement.execute(sql);
            System.out.println("------------------");
            System.out.println();
        }
    }

}
