package cn.bdqn.cn.bdqn.Spring_aop_around;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAround {
    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean03.xml");
        Book book = (Book) context.getBean("book");
        book.add();
    }
}
