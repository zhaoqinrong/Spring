package cn.itcast;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JbdcTemplate {
	//��ӷ���
    @Test
	public  void add() {

		//�������ݿ���Ϣ
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/epet");
		dataSource.setUsername("root");
		dataSource.setPassword("admin");
		//����jdbcTemplate����,��������Դ
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//����jdbcTemplate��������ķ���ʵ��
        //����sql���
        String sql="insert into user values(?,?)";

        int update = jdbcTemplate.update(sql, "zhaosan", "admin");
        System.out.println(update);
    }
    //ɾ������
    @Test
    public void remove(){
        DriverManagerDataSource dds=new DriverManagerDataSource();
        dds.setDriverClassName("com.mysql.jdbc.Driver");
        dds.setUrl("jdbc:mysql://localhost:3306/epet?useUnicode=true&characterEncoding=utf-8");
        dds.setUsername("root");
        dds.setPassword("admin");
        JdbcTemplate jtl= new JdbcTemplate(dds);

        String sql="delete from user where username=?";
        int rows=jtl.update(sql,"zhaosan");
        System.out.println(rows);

    }
    //�޸Ĳ���
    @Test
    public void  update(){
        DriverManagerDataSource dmds=new DriverManagerDataSource();
        dmds.setDriverClassName("com.mysql.jdbc.Driver");
        dmds.setUrl("jdbc:mysql://localhost:3306/epet?useUnicode=true&characterEncoding=utf-8");
        dmds.setUsername("root");
        dmds.setPassword("admin");
        JdbcTemplate jtp=new JdbcTemplate(dmds);
        String sql="update user set username=? where username=?";
        int i=jtp.update(sql,"sili","zhaosan");
        System.out.println(i);
    }

}
