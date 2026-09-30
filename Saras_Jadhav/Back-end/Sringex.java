package com.stream.employee;

public class Address {
	private String city;
	private String state;
	private String country;
	
	Address(String city,String state,String country)
	{
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String toString()
	{
		return city + " " + state + " " + country;
	}
	


}
	package com.stream.employee;

public class Employee {
	
	private int empId;
	 
	private String name;
	
	private Address address; //aggreagtion
	
	Employee()
	{
		System.out.print("default constructor");
	}
	
	Employee(int empId)
	{
		this.empId = empId;
	}
	
	Employee(String name)
	{
		this.name = name;
	}
	
	Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}

	Employee(int empId, String name, Address address)
	{
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display()
	{
		System.out.print(empId + " " + name + " " + address.toString());
	}
}
package com.stream.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String con_loc="/com/stream/employee/applicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(con_loc);
		
		Employee employee = (Employee) context.getBean("employeebean"); 
		
		employee.display();
		
		

	}

}<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           https://www.springframework.org/schema/beans/spring-beans.xsd">

	<bean id="addressBean" class="com.stream.employee.Address">
		<constructor-arg value="mumbai"></constructor-arg>
		<constructor-arg value="Maharashtra"></constructor-arg>
		<constructor-arg value="India"></constructor-arg>
	</bean>
	
    <!-- Employee Bean -->
    <bean id="employeebean" class="com.stream.employee.Employee">
       <constructor-arg value="101" type="int"></constructor-arg>
       <constructor-arg value="alex"></constructor-arg>
		<constructor-arg>
			<ref bean="addressBean"/>
		</constructor-arg>
    </bean>

	
</beans>