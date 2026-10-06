package com.stream.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


import com.stream.mapper.EmployeeRowMapper;
import com.stream.mapper.Student;
import com.stream.resource.SpringConfigFile;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	JdbcTemplate jdbc =(JdbcTemplate)	context.getBean(JdbcTemplate.class);
	String sql="SELECT * FROM employee";
List<Student> emp=	jdbc.query(sql, new EmployeeRowMapper());
for(Student std:emp)
{
	System.out.println(std.getId());
	System.out.println(std.getName());
	System.out.println(std.getSalary());
	
}
	

	}

}
