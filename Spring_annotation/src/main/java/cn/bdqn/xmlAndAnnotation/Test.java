package cn.bdqn.xmlAndAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public  void  test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = (UserService) context.getBean("service");
        userService.service();
    }
}
