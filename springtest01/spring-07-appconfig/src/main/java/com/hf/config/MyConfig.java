package com.hf.config;

import com.hf.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration代表这是一个配置类，就是之前的beans.xml
@Configuration
@ComponentScan("com.hf.pojo")
public class MyConfig {

    // 方法名作为bean的Id
    @Bean
    public User getUser(){
        return new User();
    }
}
