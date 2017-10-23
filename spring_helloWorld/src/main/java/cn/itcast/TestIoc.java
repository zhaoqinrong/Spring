package cn.itcast;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
@Test
	public void testUser(){
		//加载Spring配置文件,根据穿件对象
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User bean = (User) context.getBean("user");
		System.out.println(bean);
	}
}
