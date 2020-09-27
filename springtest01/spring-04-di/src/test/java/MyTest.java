import com.hf.pojo.Student;
import com.hf.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springtest01
 * @description: test
 * @author: xiehongfei
 * @create: 2020-09-27 22:25
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("userBeans.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("userBeans.xml");
        User user = applicationContext.getBean("user1", User.class);
        System.out.println(user);
    }

}
