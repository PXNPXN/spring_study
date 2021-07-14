package com.cunshan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//�ȼ���:    <bean id="user" class="com.com.cunshan.pojo.User"/>
//@Component ���
@Component
@Scope("prototype")
public class User {

    public String name;


    //�൱��<property name="name" value="��ɽ"/>
    @Value("��ɽ")
    public void setName(String name) {
        this.name = name;
    }
}
