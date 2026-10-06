package com.stream.mapper;

public class Student {
	private int id;
	private String name;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Id"+":"+id);
		System.out.println("Name"+":"+name);
		System.out.println("Salary"+":"+salary);
	}

}
