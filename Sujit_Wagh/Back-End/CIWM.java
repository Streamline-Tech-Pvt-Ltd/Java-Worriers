package com.stream.beans;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String name;
	private Map<String,String>answer;
	
	public Question(int id, String name, Map<String, String> answer) {
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

	public Map<String, String> getAnswer() {
		return answer;
	}

	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	
	public void disply() {
		System.out.println("Id"+":"+id+":"+"Name"+":"+name+":"+"Answer"+":"+answer);
		Set<Entry<String,String>> set = answer.entrySet();
		Iterator<Entry<String,String>> itr =set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			System.out.println("Answer:"+entry.getKey()+"Posted By:"+entry.getValue());
		}
		

	}

}
