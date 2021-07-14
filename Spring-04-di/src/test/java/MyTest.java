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
             name='������',
             address=Address{address='������'},
             books=[��¥��, ���μ�, ˮ䰴�, ��������],
             hobby=[��Ӿ, ����, ����Ӱ, ������],
             car={
                  ���֤=111112223333455555,
                  ���п�=223333333444499999
             },
             games=[LOL, CS, COC],
             wife='null',
             info={
                 ѧ��=20190525,
                 �Ա�=��,
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

