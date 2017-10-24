package cn.bdqn.Spring_annotation;

import org.springframework.stereotype.Component;

@Component(value = "userDao")
public class UserDao {
   public void addUser(){
       System.out.println("add.....");
   }
}
