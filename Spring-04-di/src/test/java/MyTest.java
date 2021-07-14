import com.cunshan.pojo.Student;
import com.cunshan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        Student{
             name='秦艺纹',
             address=Address{address='重庆市'},
             books=[红楼梦, 西游记, 水浒传, 三国演义],
             hobby=[游泳, 听歌, 看电影, 打篮球],
             car={
                  身份证=111112223333455555,
                  银行卡=223333333444499999
             },
             games=[LOL, CS, COC],
             wife='null',
             info={
                 学号=20190525,
                 性别=男,
                 password=12345678,
                 username=root
             }
         }
        */
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}

