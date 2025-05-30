package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class JDBCConfig {
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Actimize1!");
		return ds;
	}

	@Bean("jdbctemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;

	}
	/*
	 * @Bean("StudentDao") public StudentDao StudentDao() { StudentDaoImpl
	 * studentDao = new StudentDaoImpl(); studentDao.setJdbcTemplate(getTemplate());
	 * return studentDao;
	 * 
	 * }
	 */
}
