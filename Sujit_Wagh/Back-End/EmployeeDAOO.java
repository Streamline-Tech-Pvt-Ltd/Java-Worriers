package com.stream.example.dao;

import java.util.List;

import com.stream.example.model.Employee;

public interface EmployeeDao {
int save(Employee employee);
Employee getEmployee(int id);
List<Employee> getEmployees();
int update(Employee employee);
int delete(int id);

}
