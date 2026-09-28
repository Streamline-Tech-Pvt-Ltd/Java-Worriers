package in.st.beans;

import java.util.Iterator;
import java.util.List;

public class QuestionAnswer {

	private int id;
	private String name;
	private List<String> answer;
	public QuestionAnswer(int id, String name, List<String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	public void display() {
		System.out.println(id+":"+name);
		System.out.println("Answer are");
		Iterator<String> itr = answer.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}


