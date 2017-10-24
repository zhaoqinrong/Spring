package cn.bdqn.Spring_aop_04_AspectJAndAnnotion;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class Book {

    public void add(){
        System.out.println("add");
    }
}
