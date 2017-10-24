package cn.bdqn.Spring;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;


public class UserDaoImpl implements UserDao{
    private Logger logger= Logger.getLogger(UserDaoImpl.class);
    private SqlSession session =null;

    @Override
    public void addNewUser(User user) {
        try{
             session = MybatisUtil.getSession();
            UserDao mapper = session.getMapper(UserDao.class);
            mapper.addNewUser(user);
            session.commit();
        }catch (Exception e){
            session.rollback();
            logger.error(e);

        }finally {
            if(session!=null)
            MybatisUtil.closeAll(session);
        }


    }
}
