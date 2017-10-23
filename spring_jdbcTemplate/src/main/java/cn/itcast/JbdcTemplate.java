package cn.itcast;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JbdcTemplate {
	//添加方法
	@Test
	public void add() {
		// TODO Auto-generated method stub
		//设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/epet");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		//创建jdbcTemplate对象,设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//创建sql语句
		
	}

}
