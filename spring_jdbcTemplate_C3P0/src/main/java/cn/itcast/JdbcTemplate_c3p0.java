package cn.itcast;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;


public class JdbcTemplate_c3p0 {
    public void testC3p0(){

        ComboPooledDataSource cpds= new ComboPooledDataSource();//C3P0数据库连接池
        try {
            cpds.setDriverClass("com.mysql.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://localhost:3306/epet");
            cpds.setUser("root");
            cpds.setPassword("admin");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

    }
}
