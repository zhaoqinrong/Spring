package cn.bdqn.cn.bdqn.Spring_aop_around;

import org.aspectj.lang.ProceedingJoinPoint;

public class Mybook {
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("方法执行前");
        try {
            //执行方法
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("方法执行后");
    }
}
