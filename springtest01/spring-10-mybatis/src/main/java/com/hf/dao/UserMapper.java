package com.hf.dao;

import com.hf.pojo.User;

import java.util.List;

/**
 * @program: springtest01
 * @description:
 * @author: xiehongfei
 * @create: 2020-10-25 21:42
 **/
public interface UserMapper {
    List<User> selectUser();
}
