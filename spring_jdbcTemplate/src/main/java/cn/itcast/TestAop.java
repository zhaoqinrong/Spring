package cn.itcast;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	@Test
	public void test()  {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Book book=(Book)context.getBean("book");
		book.add();
	}

}
