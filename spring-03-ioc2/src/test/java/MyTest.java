import com.cunshan.pojo.User;
import com.cunshan.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ��Ҫ���ݣ�
 *    1. �����ڴ�������Ĺ����У��ǵ���������޲ι��췽��
 *       1.1 ���һ������ڴ��ι��췽������ô������ʾдһ���޲ι��췽������ᱨ��
 *       1.2 ��������вι��췽����������Ҫ
 *    2. ��������������ʱ��������Ѿ����������
 *
 */

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("User");
        UserT userT = (UserT) context.getBean("u2");
        userT.show();
    }
}
