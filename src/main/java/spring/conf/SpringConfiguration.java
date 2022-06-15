package spring.conf;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class SpringConfiguration {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		basicDataSource.setUrl("jdbc:oracle:thin:@dbhyuna_high?TNS_ADMIN=C:/git_home/git_travelProject");
		basicDataSource.setUsername("ADMIN");
		basicDataSource.setPassword("Oracle12345!!!");
		basicDataSource.setMaxTotal(20);
		basicDataSource.setMaxIdle(3);
		
		return basicDataSource;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws IOException {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setConfigLocation(new ClassPathResource("spring/mybatis-config.xml"));
		sqlSessionFactory.setDataSource(dataSource());
		//sqlSessionFactory.setMapperLocations(new ClassPathResource("member/dao/memberMapper.xml"));
		sqlSessionFactory.setMapperLocations(applicationContext.getResources("classpath:*/dao/*Mapper.xml"));
		
		return sqlSessionFactory;
	}
	
	@Bean
	public SqlSessionTemplate sqlSession() throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory().getObject());
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		
		return transactionManager;
	}
	
//	@Bean
//	public JavaMailSender javaMailSender() {
//		Properties properties = new Properties();
//		properties.put("mail.smtp.auth", true);
//		properties.put("mailtransport.protocol", "smtp");
//		properties.put("mail.smtp.starttls.enable", true);
//		properties.put("mail.smtp.starttls.required", true);
//		properties.put("mail.debug", true);
//		
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		mailSender.setHost("smtp.gmail.com");
//		mailSender.setPort(587);
//		mailSender.setUsername("skswjdalsal@gmail.com");
//		mailSender.setPassword("joun1994");
//		mailSender.setDefaultEncoding("UTF-8");
//		mailSender.setJavaMailProperties(properties);
//		
//		return mailSender;
//	}
}
