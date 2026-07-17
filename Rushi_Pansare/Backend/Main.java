package rushi.main.constructorClass;



class Student{
	int id;
	String name;
	static String collage="pccs";
	
	Student(int i, String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println("student id:" +id +"student name :" +name +"collage:"+collage);
		

	}

}

public class Main {

	public static void main(String[] args) {
		 Student obj =new  Student(101,"alex");
		obj.display();
		 Student obj1 =new  Student(102,"den");
		 obj1.display();
		
	}

}
