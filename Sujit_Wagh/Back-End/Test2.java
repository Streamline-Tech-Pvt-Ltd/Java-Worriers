package in.st.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.st.beans.QuestionAnswer;

public class Test {
	public static void main(String[] args) {
		String file_loc="/in/st/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(file_loc);
		QuestionAnswer aes = (QuestionAnswer)context.getBean("qesId()");
		aes.display();
	}

}
