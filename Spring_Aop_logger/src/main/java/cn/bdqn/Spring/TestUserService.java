package cn.bdqn.Spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService= (UserService) context.getBean("userService");
        userService.addNewUser(   new User("lisi","lisi"));
    }
}
