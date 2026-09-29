package com.stream.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConFile {

	@Bean
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource driver = new DriverManagerDataSource();
		driver.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driver.setUrl("jdbc:mysql://localhost:3306/school");
		driver.setUsername("root");
		driver.setPassword("root");
		return driver;
	}
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
		NamedParameterJdbcTemplate named = new NamedParameterJdbcTemplate(driverManagerDataSource());
		return named;
	}
}
