package cn.itcast;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

public class JbdcTemplate {
    private Logger logger=Logger.getLogger("JbdcTemplate.class");
    //查询返回单个数值
    //查询表中有多少记录
    @Test
    public void executeQuerySingletem() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/epet");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        JdbcTemplate jtl = new JdbcTemplate(dataSource);
        String sql = "select count(*) from user";
        int count = jtl.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
    //查询返回某个对象
    @Test
    public void returnObject(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/epet");
        datasource.setUsername("root");
        datasource.setPassword("admin");
        JdbcTemplate jtl= new JdbcTemplate(datasource);
        String sql="select * from user where password=?";
        User user = jtl.queryForObject(sql, new myRowMapper(), 2);
        System.out.println(user);

    }

//查询返回list集合
    @Test
    public void returnList(){
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setDriverClassName("com.mysql.jdbc.Driver");
        dmds.setUrl("jdbc:mysql://localhost:3306/epet");
        dmds.setUsername("root");
        dmds.setPassword("admin");
        JdbcTemplate jtl= new JdbcTemplate(dmds);
        String sql="select * from user";
        List<User> users = jtl.query(sql, new myRowMapper());
        System.out.println(users);
    }


}
//封装对象
class myRowMapper implements  RowMapper<User>{
    /**
     *
     * @param rs    ResultSet对象
     * @param rowNum 行号
     * @return
     * @throws SQLException
     */

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User(rs.getString(1), rs.getString(2));
        return user;
    }
}
