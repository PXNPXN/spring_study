package com.cunshan.pojo;

public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }

    public void init(){
        System.out.println("我被创建了");
    }

    public void destroy(){
        System.out.println("我被删除了");
    }
}
