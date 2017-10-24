package cn.itcast;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoc {
    private Logger logger = Logger.getLogger(TestIoc.class);

    @Test
    public void testUser() {
        //加载Spring配置文件,根据穿件对象
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            User bean = (User) context.getBean("user");
            System.out.println(bean);

        } catch (Exception e) {

            logger.error(e);
        }

    }
}
