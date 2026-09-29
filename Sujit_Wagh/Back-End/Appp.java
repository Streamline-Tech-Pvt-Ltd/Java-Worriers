package com.st.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.st.beans.Student;
import com.st.mapper.StudentRowMapper;
import com.st.mapper.Teacher;
import com.st.resources.SpringConFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConFile.class);
      JdbcTemplate jdbc = (JdbcTemplate) context.getBean(JdbcTemplate.class);
//      Student std = new Student();
//    int id=4;
//    String name ="saras";
//    String address="Loni";
//      String insert_query="INSERT INTO student VALUES(?,?,?)";
//   int count =   jdbc.update(insert_query,id,name,address);
//   if(count>0)
//   {
//	   System.out.println("Data inserted succefully");
//   }else
//   {
//	   System.out.println("Data can not inserted");
//   }
      String select_query="SELECT * FROM student";
    List<Teacher> std = jdbc.query(select_query, new StudentRowMapper());
    for(Teacher t :std)
    {
    	System.out.println(t.getId());
    	System.out.println(t.getName());
    	System.out.println(t.getAddress());
    	System.out.println("----------------");
    }
    
    }
}
