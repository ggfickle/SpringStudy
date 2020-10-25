package com.hf.service.impl;

import com.hf.service.UserService;

/**
 * @program: springtest01
 * @description: 接口实现类
 * @author: xiehongfei
 * @create: 2020-10-25 17:06
 **/
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("添加功能");
    }

    public void query() {
        System.out.println("查询功能");
    }

    public void delete() {
        System.out.println("删除功能");
    }

    public void update() {
        System.out.println("更新功能");
    }
}
