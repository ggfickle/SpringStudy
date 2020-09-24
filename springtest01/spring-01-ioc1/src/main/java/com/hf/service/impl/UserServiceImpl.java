package com.hf.service.impl;

import com.hf.dao.UserDao;
import com.hf.service.UserService;

/**
 * @program: springtest01
 * @description: UserService
 * @author: xiehongfei
 * @create: 2020-09-24 20:47
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //利用set实现动态实现
    public void setUserDao(UserDao userDao) {
        this.userDao=userDao;
    }

    public void getUserInfo() {
        userDao.getUserInfo();
    }
}
