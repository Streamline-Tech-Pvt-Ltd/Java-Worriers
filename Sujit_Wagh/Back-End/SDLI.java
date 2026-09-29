package com.stream.Demo;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answer> answer; 
	
	public Question() {
		
	}

	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
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

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answer=" + answer + "]";
	}
	public void display() {
		//System.out.println("Id"+":"+id+":"+"Name"+":"+name+":"+"Answer"+":"+answer);
		Iterator<Answer> itr = answer.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	
	

}
