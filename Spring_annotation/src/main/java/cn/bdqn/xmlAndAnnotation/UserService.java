package cn.bdqn.xmlAndAnnotation;

import javax.annotation.Resource;

public class UserService {
    @Resource(name = "userDao")
    private UserDao userDao;
    @Resource(name = "bookDao")
    private BookDao bookDao;

    public void service(){
        System.out.println("service");
        userDao.addUser();
        bookDao.addBook();
    }
}
