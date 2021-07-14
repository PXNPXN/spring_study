import com.cunshan.mapper.UserMapper;
import com.cunshan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyTest {
   @Test
    public void test() throws IOException {
     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
      for(User user : (List<User>)userMapper.selectUser()){
         System.out.println(user);
      }
   }
}
