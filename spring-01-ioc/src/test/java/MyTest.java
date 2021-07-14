import com.cunshan.dao.UserDaoMysqlImpl;
import com.cunshan.dao.UserDaoOracleImpl;
import com.cunshan.service.UserService;
import com.cunshan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //用户实际上是调业务层，dao层他们不需要解除！
//        UserService userService = new UserServiceImpl();
//        userService.setUser(new UserDaoOracleImpl());
//        userService.getUser();



        //获取ApplicationContext，拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //容器在手，天下我有，需要什么，就直接get什么!
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
