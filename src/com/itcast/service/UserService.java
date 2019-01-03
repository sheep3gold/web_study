package com.itcast.service;

import com.itcast.beans.User;
import com.itcast.dao.UserDao;

import java.util.List;

public class UserService {
    UserDao userDao = new UserDao();

    public User LoginTest(String name,String pwd) {
        User u = null;
        try {
            u = userDao.findUserByName(name);
        } catch (Exception e) {
            System.out.println();
        }

        return u;
    }

    public boolean FindUserById(String username) {
        User u = null;
        try {
            u = userDao.findUserByName(username);
        } catch (Exception e) {
            System.out.println();
        }
        if (u == null) {
            return false;
        }else {
            return true;
        }
    }

    public boolean registUser(User user) {
        boolean b = userDao.regist(user);
        return true;
    }

    public List<User> queryUserByName(String name) {
        List<User> list = userDao.queryUserByName(name);
        return list;
    }
}
