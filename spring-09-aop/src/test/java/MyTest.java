import com.cunshan.service.UserService;
import com.cunshan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        //动态代理代理的是接口 ：注意点
        UserService userService = (UserService) context.getBean("userService");
        userService.insert();
    }
}
