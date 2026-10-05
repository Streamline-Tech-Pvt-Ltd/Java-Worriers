package com.stream.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stream.example.dao.EmployeeDao;
import com.stream.example.model.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDao empDao =(EmployeeDao)	context.getBean("employeeDao");
	Employee emp = new Employee(3,"saras",1000000);
int count=	empDao.save(emp);
if(count>0)
{
	System.out.println("Data inserted ");
}else
{
	System.out.println("Data can not inserted");
}

	}
	

}
