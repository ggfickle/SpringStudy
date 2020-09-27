import com.hf.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springtest01
 * @description: test
 * @author: xiehongfei
 * @create: 2020-09-27 23:35
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans2.xml");
        Person people = applicationContext.getBean("person", Person.class);
        people.getCat().shout();
        people.getDog().shout();
    }
}
