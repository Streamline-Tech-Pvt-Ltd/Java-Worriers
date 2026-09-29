package com.stream.Demo;

public class Answer {
	private int id;
	private String name;
	private String bye;
	
	public Answer() {
		
	}

	public Answer(int id, String name, String bye) {
		super();
		this.id = id;
		this.name = name;
		this.bye = bye;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", bye=" + bye + "]";
	}
	

}
