package com.cunshan.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//�������ע�����˼������˵������౻Spring�ӹ��ˣ�ע�ᵽ��������
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("���") //����ע��ֵ
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
