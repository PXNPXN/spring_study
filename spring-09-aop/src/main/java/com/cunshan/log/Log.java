package com.cunshan.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice{

    /**
     *
     * @param method：要执行的目标对象的方法
     * @param args 参数
     * @param target 目标
     * @throws Exception
     */
    public void before(Method method,Object[] args,Object target) throws Exception{
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行");
    }
}