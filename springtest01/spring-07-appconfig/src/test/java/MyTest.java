import com.hf.config.MyConfig;
import com.hf.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
        // 方法名作为bean的对象名
        User user = applicationContext.getBean("getUser", User.class);
        System.out.println(user);
    }
}
