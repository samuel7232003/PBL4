package com.example.demo1.model;

import java.util.Date;

public class Messenger {
    private int ID_messenger;
    private Date time_send;
    private User user_send;
    private String content;

    public int getID_messenger() {
        return ID_messenger;
    }
    public Date getTime_send(){
        return time_send;
    }
    public User getUser_send(){
        return user_send;
    }
    public String getContent(){
        return content;
    }
}
