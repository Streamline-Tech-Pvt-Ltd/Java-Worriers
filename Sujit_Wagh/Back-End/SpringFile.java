package com.stream.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {
	@Bean
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driver.setUrl("jdbc:mysql://localhost:3306/spring_db");
		driver.setUsername("root");
		driver.setPassword("root");
		return driver;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
	  JdbcTemplate jdbc = new JdbcTemplate(driverManagerDataSource());
	  return jdbc;
	}

}
