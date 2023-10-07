package com.example.demo1.service.impl;

import com.example.demo1.dao.IUserDAO;
import com.example.demo1.dao.impl.UserDAO;
import com.example.demo1.model.User;
import com.example.demo1.service.IUserService;

public class UserService implements IUserService {
    private static IUserService userService;
    public static IUserService getInstance() {
        if(userService == null) {
            userService = new UserService();
        }
        return userService;
    }
    @Override
    public User register(String userName, String password, String userFullname) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setUserFullname(userFullname);

        return UserDAO.getInstance().createUser(user);
    }
}
