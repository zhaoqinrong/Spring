package cn.itcast;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JbdcTemplate {
	//��ӷ���
	@Test
	public void add() {
		// TODO Auto-generated method stub
		//�������ݿ���Ϣ
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/epet");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		//����jdbcTemplate����,��������Դ
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//����sql���
		
	}

}
