package com.cunshan.service;

import com.cunshan.dao.UserDao;


public class UserServiceImpl implements UserService{
    //������ϵ���ʽ
    // private UserDao userDao = new UserDaoMysqlImpl();

    private UserDao userDao;

    //���ýӿڵķ�ʽ��ͨ��set����ע�룬�����û�ѡ����Ҫ���õ�ʵ��
    @Override
    public void setUser(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
