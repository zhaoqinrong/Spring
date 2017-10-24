package cn.bdqn.Spring;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;


public class MybatisUtil {
//    private static Logger logger = Logger.getLogger(MybatisUtil.class);
    private static InputStream resourceAsStream = null;
    private static SqlSessionFactory build = null;
    private static SqlSession sqlSession = null;
    static {
        String resource = "Mybatis-config.xml";
        try {
            resourceAsStream = Resources.getResourceAsStream(resource);
            build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession(false);//false为不自动提交事务.true为自动提交事务
        } catch (IOException e) {
//            logger.error(e);
        }
    }



    public static SqlSession getSession() {
        if(sqlSession==null){
         return   build.openSession(false);
        }


        return sqlSession;
    }
    public static void closeAll(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }

}
