package com.hf.dao.impl;

import com.hf.dao.UserDao;

/**
 * @program: springtest01
 * @description: MysqlDaoImpl
 * @author: xiehongfei
 * @create: 2020-09-24 20:53
 **/
public class UserMysqlDaoImpl  implements UserDao {

    public void getUserInfo() {
        System.out.println("Get Mysql Info!");
    }
}
