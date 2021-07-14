package com.cunshan.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("从MySQL中获取用户的信息");
    }
}
