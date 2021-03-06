package com.hf.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @program: springtest01
 * @description: AfterLog
 * @author: xiehongfei
 * @create: 2020-10-25 17:10
 **/
public class AfterLog implements AfterReturningAdvice {

    //o：返回值
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"，返回结果为："+o);
    }
}
