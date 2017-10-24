package cn.itcast;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void test() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
      OrderService orderService=(OrderService)classPathXmlApplicationContext.getBean("ordersService");
        orderService.accountMoney();

    }
}
