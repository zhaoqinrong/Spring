package cn.itcast;

import org.springframework.jdbc.core.JdbcTemplate;

public class OrdersDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * 对数据库操作的方法,不写业务操作
     */
    //少钱的方法
    public void lessMoney() {
        String sql="update account set money=money-? where username=?";
        jdbcTemplate.update(sql,1000,"小王");
    }

    //多钱的方法
    public void moreMoney() {
    String sql="update account set money=money+? where username=?";
    jdbcTemplate.update(sql,1000,"小马");
    }
}
