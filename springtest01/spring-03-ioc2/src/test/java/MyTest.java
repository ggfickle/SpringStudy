import com.hf.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springtest01
 * @description: Test User
 * @author: xiehongfei
 * @create: 2020-09-24 22:33
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println((User) applicationContext.getBean("user"));
        System.out.println((User) applicationContext.getBean("user1"));
        System.out.println((User) applicationContext.getBean("user2"));
        System.out.println((User) applicationContext.getBean("user3"));
        System.out.println((User) applicationContext.getBean("userTT"));
    }
}
