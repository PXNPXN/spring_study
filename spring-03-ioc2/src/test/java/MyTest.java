import com.cunshan.pojo.User;
import com.cunshan.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 主要内容：
 *    1. 容器在创建对象的过程中，是调用了类的无参构造方法
 *       1.1 如果一个类存在带参构造方法，那么必须显示写一个无参构造方法否则会报错
 *       1.2 如果想用有参构造方法，我们需要
 *    2. 并且在容器创建时，对象就已经创建完毕了
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
