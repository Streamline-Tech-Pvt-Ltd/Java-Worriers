package com.stream.main;


import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.stream.beans.Teacher;
import com.stream.resources.SpringConFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConFile.class);
    NamedParameterJdbcTemplate named =(NamedParameterJdbcTemplate)   context.getBean(NamedParameterJdbcTemplate.class);
  
    Teacher te = new Teacher();
    
   
   
   Map<String,Object> m= new HashMap<>();
   m.put("id", 1);
   m.put("name", "sahil");
   m.put("address", "mumbai");
   m.put("salary", 45000f);
   String insert_query="INSERT INTO teacher VALUES(:id,:name,:address,:salary)";
  int count = named.update(insert_query, m);
   if(count>0)
   {
	   System.out.println("Data can inserted ");
   }
   else {
	   System.out.println("Data can not inserted");
   }
   
       
    }
}
