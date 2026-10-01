package com.stream.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConFile.xml");
	Employee emp =(Employee)context.getBean("emp2");
	emp.display();
	}

}
