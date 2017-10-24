package cn.bdqn.Spring_aop_02_after;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("bean02.xml");
        Book book= (Book) context.getBean("book");
        book.add();
    }
}
