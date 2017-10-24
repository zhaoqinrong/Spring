package cn.bdqn.Spring_annotation;

import org.springframework.stereotype.Component;

@Component(value = "newsDao")
public class NewsDao {
    public  void addNews(){
        System.out.println("addNews");
    }
}
