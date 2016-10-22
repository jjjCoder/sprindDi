package ru.sbt;

public class User {
    private Long id;
    private String login;
    private String passwordMd5;

    public User() {
    }

    public User(Long id, String login, String passwordMd5) {
        this.id = id;
        this.login = login;
        this.passwordMd5 = passwordMd5;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordMd5() {
        return passwordMd5;
    }

    public void setPasswordMd5(String passwordMd5) {
        this.passwordMd5 = passwordMd5;
    }
}
