package com.stream.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.stream.main")
public class AppConfig {

	@Bean(destroyMethod = "close")
    public HikariDataSource dataSource() {

        HikariDataSource dataSource =
                new HikariDataSource();

        // MySQL connection details
        dataSource.setDriverClassName(
                "com.mysql.cj.jdbc.Driver");

        dataSource.setJdbcUrl(
                "jdbc:mysql://localhost:3306/spring_jdbc_demo");

        dataSource.setUsername("root");
        dataSource.setPassword("root");

        // Connection pool configuration
        dataSource.setPoolName("EmployeeConnectionPool");
        dataSource.setMaximumPoolSize(10);
        dataSource.setMinimumIdle(2);
        dataSource.setConnectionTimeout(30000);
        dataSource.setIdleTimeout(600000);
        dataSource.setMaxLifetime(1800000);

        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
