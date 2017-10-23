package cn.itcast;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void test(){
        ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("bean.xml");
        UserService us= (UserService) cpxac.getBean("userService");
        us.add();
    }

}
