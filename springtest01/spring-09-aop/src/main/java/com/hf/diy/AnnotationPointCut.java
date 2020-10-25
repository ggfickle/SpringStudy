package com.hf.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @program: springtest01
 * @description:
 * @author: xiehongfei
 * @create: 2020-10-25 17:45
 **/
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.hf.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }

    @After("execution(* com.hf.service.impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }
}
