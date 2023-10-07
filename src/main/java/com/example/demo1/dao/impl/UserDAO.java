package com.example.demo1.dao.impl;

import com.example.demo1.dao.IUserDAO;
import com.example.demo1.model.User;

import java.sql.*;

public class UserDAO implements IUserDAO {

    private static IUserDAO userDAO;
    public static IUserDAO getInstance() {
        if (userDAO == null) {
            userDAO = new UserDAO();
        }
        return userDAO;
    }

    public User createUser(User user) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
        StringBuilder hql = new StringBuilder("");
        hql.append("insert into user (ip_user, user_name, password, user_fullname) values (" + 4 + ", '" + user.getUserName() + "', '" + user.getPassword() + "', '" + user.getUserFullname()+"');");
        Statement stm = null;
        try {
            stm = conn.createStatement();
            stm.executeUpdate(hql.toString());
            conn.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
