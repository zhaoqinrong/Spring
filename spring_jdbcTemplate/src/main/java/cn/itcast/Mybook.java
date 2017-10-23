package cn.itcast;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class Mybook {
	//在方法上面使用注解方法完成增强配置
	@Before(value="execution(* cn.itcast.Book.*(..))")
	private void before() {
		System.out.println("before");

	}

}
