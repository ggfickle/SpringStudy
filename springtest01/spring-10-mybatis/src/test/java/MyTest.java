import com.hf.dao.UserMapper;
import com.hf.dao.UserMapperImpl;
import com.hf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: springtest01
 * @description: Test
 * @author: xiehongfei
 * @create: 2020-10-25 21:20
 **/
public class MyTest {

    @Test
    public void selectUser() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserMapperImpl userMapper = applicationContext.getBean("userMapper", UserMapperImpl.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
