package com.cunshan.dome4;

import com.cunshan.dome2.UserService;
import com.cunshan.dome2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色：不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //����Ҫ����Ķ���
        pih.setTarget(userService);
        //��̬���ɴ�����
        UserService proxy = (UserService) pih.getProxy();
        proxy.query();
    }
}
