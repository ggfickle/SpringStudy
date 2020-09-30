package com.hf.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @program: springtest01
 * @description: person
 * @author: xiehongfei
 * @create: 2020-09-27 23:23
 **/
public class Person {

    /**
     * 也可使用@Resource java内部注解进行装配 ,Resource可通过@Resource(name = "dog11")进行选择
     *
     * @Autowired 注解是默认是按照ByType进行注入,不符合再进行ByName
     *
     * @Resource 注解是默认是按照ByName进行注入,不符合再进行ByType
     */
    @Autowired
    private Cat cat;

    /**
     * 如果有多个dog对象则使用 @Qualifier(value = "dog11") 进行选择
     */
    @Autowired
    @Qualifier(value = "dog11")
    private Dog dog;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
