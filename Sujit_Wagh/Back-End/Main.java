package com.stream.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stream.student.Student;

public class Main {

	public static void main(String[] args) {
		String con_log="com/stream/resources/SpringConfig.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(con_log);
		Student std =(Student)context.getBean("stdId()");
		std.display();
	}

}
