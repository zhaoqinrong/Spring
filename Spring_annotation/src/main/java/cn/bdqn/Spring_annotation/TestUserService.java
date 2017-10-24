package cn.bdqn.Spring_annotation;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       UserService us= (UserService) context.getBean("userService");
       us.addUser();
    }
}
