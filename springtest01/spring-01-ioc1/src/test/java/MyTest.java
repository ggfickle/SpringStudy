import com.hf.dao.impl.UserMysqlDaoImpl;
import com.hf.service.UserService;
import com.hf.service.impl.UserServiceImpl;

/**
 * @program: springtest01
 * @description: Test
 * @author: xiehongfei
 * @create: 2020-09-24 20:50
 **/
public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层,dao层实际不需要接触
        UserService userService=new UserServiceImpl();

        ((UserServiceImpl) userService).setUserDao(new UserMysqlDaoImpl());
        userService.getUserInfo();
    }
}
