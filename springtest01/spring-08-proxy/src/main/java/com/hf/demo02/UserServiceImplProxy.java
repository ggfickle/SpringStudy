package com.hf.demo02;

/**
 * @program: springtest01
 * @description: UserServiceImplProxy
 * 在不改变原有业务的情况下实现对功能的追加
 * @author: xiehongfei
 * @create: 2020-10-02 12:03
 **/
public class UserServiceImplProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    private void log(String msg) {
        System.out.println("实现了" + msg + "功能");
    }
}
