import com.cunshan.config.MyConfig;
import com.cunshan.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //�����ȫʹ���������෽ʽȥ�������Ǿ�ֻ��ͨ��AnnotationConfig ����������ȡ������ͨ���������class������أ�
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
