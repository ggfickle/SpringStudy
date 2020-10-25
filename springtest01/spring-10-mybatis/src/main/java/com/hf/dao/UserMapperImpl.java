package com.hf.dao;

import com.hf.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @program: springtest01
 * @description:  此章节代码有问题，无法运行
 * @author: xiehongfei
 * @create: 2020-10-25 21:50
 **/


public class UserMapperImpl implements UserMapper{

    //sqlSession不用我们自己创建了，Spring来管理
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
