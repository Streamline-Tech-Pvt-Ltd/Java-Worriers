package com.st.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Teacher> {

	@Override
	public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Teacher te= new Teacher();
		te.setId(rs.getInt("id"));
		te.setName(rs.getString("name"));
		te.setAddress(rs.getString("address"));
		return te;
	}

}
