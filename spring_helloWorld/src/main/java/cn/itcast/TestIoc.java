package cn.itcast;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
@Test
	public void testUser(){
		//����Spring�����ļ�,���ݴ�������
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User bean = (User) context.getBean("user");
		System.out.println(bean);
	}
}
