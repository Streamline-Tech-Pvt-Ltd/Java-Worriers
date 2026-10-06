package com.stream.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stream.beans.Employee;

public class EmployeeRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();
		std.setId(rs.getInt("id"));
		std.setName(rs.getString("name"));
		std.setSalary(rs.getDouble("salary"));
		return std;
	}


	

	

}
