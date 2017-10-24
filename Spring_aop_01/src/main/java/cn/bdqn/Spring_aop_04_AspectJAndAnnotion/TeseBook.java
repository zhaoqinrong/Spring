package cn.bdqn.Spring_aop_04_AspectJAndAnnotion;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeseBook {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean04.xml");
        Book book= (Book) context.getBean("book");
        book.add();
    }
}
