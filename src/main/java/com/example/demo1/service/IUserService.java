package com.example.demo1.service;

import com.example.demo1.model.User;

public interface IUserService {
    public User register(String userName, String password, String userFullname);
}
