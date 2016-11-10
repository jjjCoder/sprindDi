package ru.sbt.jdbc;

public class DaoDemo {
    private final UserDao userDao;
    
    public DaoDemo() {
        JdbcTemplate jdbcTemplate=new JdbcTemplate("jdbc:h2:C:/Users");
        userDao=new UserDaoImplWithJdbc(jdbcTemplate);
    }

    public static void main(String[] args) {
        DaoDemo daoDemo=new DaoDemo();
        daoDemo.listUsers();
        daoDemo.createUser("root", "password");
        
    }

    private void createUser(String root, String password) {
    }

    private void listUsers() {
    }
}
