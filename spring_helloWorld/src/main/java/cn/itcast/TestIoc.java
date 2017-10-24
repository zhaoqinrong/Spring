package cn.itcast;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoc {
    private Logger logger = Logger.getLogger(TestIoc.class);

    @Test
    public void testUser() {
        //����Spring�����ļ�,���ݴ�������
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            User bean = (User) context.getBean("user");
            System.out.println(bean);

        } catch (Exception e) {

            logger.error(e);
        }

    }
}
