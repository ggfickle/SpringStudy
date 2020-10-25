package test;

import com.hf.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springtest01
 * @description: test
 * @author: xiehongfei
 * @create: 2020-10-25 17:19
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("beans2.xml");
        UserService userService2 = applicationContext2.getBean("userService", UserService.class);
        userService2.add();

        ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("beans3.xml");
        UserService userService3 = applicationContext3.getBean("userService", UserService.class);
        userService3.add();
    }
}
