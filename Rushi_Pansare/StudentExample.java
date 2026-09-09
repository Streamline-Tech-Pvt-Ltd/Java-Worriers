package com.main.Exception;

public class StudentExample {
	
	String name;
	int age;
	
	public String toString() {
		return name + "   "+age;
		
	}
	public static void main(String[] args) {
		StudentExample s1=new StudentExample();
		s1.name="alex";
		s1.age=22;
		System.out.println(s1.toString());  //string reprsentation of an objeact
		
	}

}
