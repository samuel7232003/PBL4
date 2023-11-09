package com.example.demo1.dao.impl;

import com.example.demo1.dao.IUserDAO;
import com.example.demo1.model.User;

import javax.xml.transform.Result;
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
        Statement stm = null;
        try {
            stm = conn.createStatement();
            String sql = "select count(*) from user;";
            ResultSet rs = stm.executeQuery(sql);
            int i=0;
            while (rs.next()){
                i = rs.getInt(1) + 1;
            }
            hql.append("insert into user (ID_user, name, username, password, email, isLogin) values (" + i + ", '" + user.getUserName() + "', '" + user.getPassword() + "', '" + user.getUserFullname()+"');");
            stm.executeUpdate(hql.toString());
            conn.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
//    public int login(User user){
//        return 0;
//    }
}
