package in.st.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.st.beans.Employee;

public class Test {
	public static void main(String[] args) {
		String file_loc="/in/st/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(file_loc);
	Employee emp =(Employee)	context.getBean("empId()");
	emp.display();
		
	}

}
