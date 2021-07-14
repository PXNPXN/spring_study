package com.cunshan.service;

import com.cunshan.dao.UserDao;


public class UserServiceImpl implements UserService{
    //采用组合的形式
    // private UserDao userDao = new UserDaoMysqlImpl();

    private UserDao userDao;

    //利用接口的方式，通过set方法注入，来让用户选择需要调用的实例
    @Override
    public void setUser(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
