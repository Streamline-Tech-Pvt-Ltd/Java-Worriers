package com.stream.main;

import org.springframework.beans.propertyeditors.ClassArrayEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.streamlineteach.springpro.Quention;

public class Main {

	public static void main(String[] args) {
		String file_loc="/com/stream/resource/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(file_loc);
	Quention Que =(Quention)context.getBean("QueId");
	Que.display();
		
		

	}

}
package com.streamlineteach.springpro;

public class Answers {
	private int id;
	private String name;
	private String bye ;
	
	public Answers() {
		
	}

	public Answers(int id, String name, String bye) {
		super();
		this.id = id;
		this.name = name;
		this.bye = bye;
	}

	@Override
	public String toString() {
		return "Answers [id=" + id + ", name=" + name + ", bye=" + bye + "]";
	}
	

}
package com.streamlineteach.springpro;

import java.util.List;

public class Quention {
	
	private int id;
	private String name;
	private List<Answers> answers;
	
	public Quention(){
		
		
	}

	public Quention(int id, String name, List<Answers> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Quention [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
	
	
	public void display() {
		
		System.out.println("id: "+id +"name: "+name+"answer: "+answers);
	}
	
}
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- bean definitions here -->
    <bean class ="com.streamlineteach.springpro.Quention" id="QueId">
    
    <constructor-arg type ="int" value="1"></constructor-arg>
    <constructor-arg type ="String" value="what is java"></constructor-arg>
    <constructor-arg>
    <list>
    <ref bean="ans1"/>
    <ref bean="ans2"/>
    </list>
    
    </constructor-arg>
   </bean>
   
  <bean class="com.streamlineteach.springpro.Answers" id="ans1">
  <constructor-arg type="int" value="1"></constructor-arg>
  <constructor-arg type="String" value="java is a programming language"></constructor-arg>
  <constructor-arg type="String" value="Sujit"></constructor-arg>
  </bean>
  
  <bean class="com.streamlineteach.springpro.Answers" id="ans2">
  <constructor-arg type="int" value="2"></constructor-arg>
  <constructor-arg type="String" value="java is a language"></constructor-arg>
  <constructor-arg type="String" value="Rahul"></constructor-arg> 
  </bean>
    

</beans>
s