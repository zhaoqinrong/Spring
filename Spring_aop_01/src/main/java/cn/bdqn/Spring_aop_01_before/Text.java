package cn.bdqn.Spring_aop_01_before;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book= (Book) context.getBean("book");
        book.add();

    }
}
