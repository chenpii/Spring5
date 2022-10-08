package com.chenp.spring5.service;

import com.chenp.spring5.dao.UserDao;

public class UserService {
    //创建userdao属性及其set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add() {
        System.out.println("service add ...");
        userDao.update();
    }
}
