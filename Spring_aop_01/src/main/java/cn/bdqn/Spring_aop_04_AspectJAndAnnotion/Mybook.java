package cn.bdqn.Spring_aop_04_AspectJAndAnnotion;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Mybook {
    @Before(value = "execution(* cn.bdqn.Spring_aop_04_AspectJAndAnnotion.Book.*(..))")
    public  void befroe(){
        System.out.println("before");
    }
}
