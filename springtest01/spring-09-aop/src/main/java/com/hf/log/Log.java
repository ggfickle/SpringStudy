package com.hf.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @program: springtest01
 * @description: 日志类
 * @author: xiehongfei
 * @create: 2020-10-25 17:08
 **/
public class Log implements MethodBeforeAdvice {

    //method:要执行的目标对象的方法
    //objects：参数
    //o：目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
