package com.cunshan.config;

import com.cunshan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *���Ҳ�ᱻSpring�����йܣ�ע�ᵽ�����У���Ϊ����������һ��@Component
 *@Configuration ��������һ�������࣬�ͺ�����֮ǰ����beans.xmlһ��
 */

@Configuration
@ComponentScan("com.cunshan.pojo")
@Import(MyConfig2.class)
public class MyConfig {
    /**
     * ע��һ��bean�����൱������֮ǰд��һ��bean��ǩ
     * ������������־��൱�� bean��ǩ�е�id����
     * @return ����ֵ���൱��bean��ǩ�е�class����
     */
    @Bean
    public User getUser(){
        return new User();
    }
}

