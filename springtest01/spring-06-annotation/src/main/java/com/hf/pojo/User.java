package com.hf.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//等价于<bean id="user" class="com.hf.pojo.User"/>
//@Component 组件
//@Scope("singleton") 单例   @Scope("prototype") 原型（多例）
@Component
@Scope("singleton")
public class User {
    public String name = "张三";

    //使用@Value注解来给属性注入值
    @Value("Hangzhou")
    public String address;
}
