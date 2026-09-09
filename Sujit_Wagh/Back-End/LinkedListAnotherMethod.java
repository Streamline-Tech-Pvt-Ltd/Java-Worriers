package main.in.sp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAnotherMethod {

	public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	s1.setId(1);
	s1.setName("Sujit");
	s1.setEmail("sujitwagh532@gmail.com");
	s1.setAddress("Newasa");
	s2.setId(2);
	s2.setName("Ram");
	s2.setEmail("ram532@gmail.com");
	s2.setAddress("Pune");
	s3.setId(3);
	s3.setName("pratik");
	s3.setEmail("pratikale52@gmail.com");
	s3.setAddress("Mumbai");
   List<Student> li= new LinkedList<Student>();
   li.add(s1);
   li.add(s2);
   li.add(s3);
  System.out.println(li);
  
  
	List<Student> li3 = new LinkedList<Student>();
	li3.add(new Student(1,"Ram","Ram123@gmail.com","Pune"));
	li3.add(new Student(2,"Rahul","Rahul456@gmail.com","Mumbai"));
	System.out.println(li3);
	
		List<Integer> li1 = List.of(1,2,3,5);
		System.out.println(li1);
	    List<Integer>ar = Arrays.asList(1,5,6,40);
	    System.out.println(ar);
		List<Student> li2 = Arrays.asList(new Student(1,"Ram","ram123@gmail.com","Pune"));
		System.out.println(li2);
		
	    
	    
	
	
	

	}

}
