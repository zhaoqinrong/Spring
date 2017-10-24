package cn.bdqn.Spring;

import org.apache.log4j.Logger;

public class MyUserService {
    private Logger logger=Logger.getLogger(MyUserService.class);
    public  void before(){
        System.err.println("before");
    }
    public void after(){
        System.err.println("before");
    }
}
