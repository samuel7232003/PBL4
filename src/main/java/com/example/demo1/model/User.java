package com.example.demo1.model;

public class User {
    private String id_user;
    private String userName;
    private String password;
    private String userFullname;

    public String getId_user() {
        return id_user;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getUserFullname() {
        return userFullname;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    public User(String id_user, String userName, String password, String userFullname){
        this.id_user = id_user;
        this.userName = userName;
        this.password = password;
        this.userFullname = userFullname;
    }
    public User(){}
}
