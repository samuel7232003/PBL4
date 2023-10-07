package com.example.demo1.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "pbl4";
    private String username = "root";
    private String password = "";
    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;
    public Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Ket noi thanh cong");
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println("Ket noi that bai");
        }
        return conn;
    }
}
