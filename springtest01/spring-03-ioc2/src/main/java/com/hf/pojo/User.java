package com.hf.pojo;

/**
 * @program: springtest01
 * @description: User pojo
 * @author: xiehongfei
 * @create: 2020-09-24 22:29
 **/
public class User {

    /** 姓名*/
    private String name;

    /** 年龄*/
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
