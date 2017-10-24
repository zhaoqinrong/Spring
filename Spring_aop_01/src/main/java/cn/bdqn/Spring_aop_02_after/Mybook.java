package cn.bdqn.Spring_aop_02_after;

import org.aspectj.lang.ProceedingJoinPoint;

public class Mybook {
    public void after(){
        System.out.println("后置增强");
    }
}
