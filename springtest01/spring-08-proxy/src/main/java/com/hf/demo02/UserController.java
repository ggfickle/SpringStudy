package com.hf.demo02;

/**
 * @program: springtest01
 * @description: Controller
 * @author: xiehongfei
 * @create: 2020-10-02 12:11
 **/
public class UserController {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImplProxy userServiceImplProxy = new UserServiceImplProxy();
        userServiceImplProxy.setUserService(userService);

        userServiceImplProxy.add();
        userServiceImplProxy.query();
        userServiceImplProxy.delete();
        userServiceImplProxy.update();
    }
}
