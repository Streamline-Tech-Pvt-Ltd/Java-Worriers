package com.stream.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stream.Demo.Question;

public class Main {
	public static void main(String[] args) {
		String file_loc="/com/stream/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(file_loc);
	Question que = (Question)	context.getBean("QueId");
	que.display();
		
	}

}
