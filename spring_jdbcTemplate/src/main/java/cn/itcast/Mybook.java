package cn.itcast;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class Mybook {
	//�ڷ�������ʹ��ע�ⷽ�������ǿ����
	@Before(value="execution(* cn.itcast.Book.*(..))")
	private void before() {
		System.out.println("before");

	}

}
