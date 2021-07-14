import com.cunshan.dao.UserDaoMysqlImpl;
import com.cunshan.dao.UserDaoOracleImpl;
import com.cunshan.service.UserService;
import com.cunshan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //�û�ʵ�����ǵ�ҵ��㣬dao�����ǲ���Ҫ�����
//        UserService userService = new UserServiceImpl();
//        userService.setUser(new UserDaoOracleImpl());
//        userService.getUser();



        //��ȡApplicationContext���õ�spring������
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //�������֣��������У���Ҫʲô����ֱ��getʲô!
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
