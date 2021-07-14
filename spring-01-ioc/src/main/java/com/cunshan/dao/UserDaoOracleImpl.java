package com.cunshan.dao;

public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("从Oracle中获取用户信息");
    }
}
