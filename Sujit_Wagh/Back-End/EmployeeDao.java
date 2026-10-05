package com.stream.example.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.stream.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  

	@Override
	public int save(Employee employee) {
		String sql="INSERT INTO employee(id,name,salary) VALUES(?,?,?)";
		return jdbcTemplate.update(sql,employee.getId(),employee.getName(),employee.getSalary());
	}

	@Override
	public Employee getEmployee(int id) {
		String sql="SELECT * FROM employee WHERE id=?";
		return jdbcTemplate.queryForObject(sql, (rs,rowNum)->{
			Employee emp = new Employee(rowNum, sql, rowNum);
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getDouble("salary"));
			
			return emp;
			
			
		});
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Employee employee) {
		String sql="UPDATE employee SET name=? , salary =? WHERE id=?";
		
		return jdbcTemplate.update(sql,employee.getName(),employee.getSalary(),employee.getId());
	}

	@Override
	public int delete(int id) {
		String sql="DELETE FROM employee WHERE id=?";
		
		return jdbcTemplate.update(sql,id) ;
	}



}
