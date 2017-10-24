package cn.bdqn.Spring_annotation;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component(value = "userService")
public class UserService {
    @Autowired
    private UserDao userDao;
    @Resource(name="newsDao")
    private NewsDao newsDao;

    public void  addUser(){
        System.out.println("service");
        userDao.addUser();
        newsDao.addNews();
    }
}
