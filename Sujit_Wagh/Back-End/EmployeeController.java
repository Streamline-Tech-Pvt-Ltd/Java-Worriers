package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.services.EmployeeService;

@RestController
public class EmployeeController {
	private final EmployeeService employeeService;
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
		
	}
	@GetMapping("/employee")
	public String getEmployee() {
		return employeeService.getEmployee();	
		
	}
	

}
