package rushi.main.constructorClass;

class Students {
 int rollno;
 String name;


void display() {
	System.out.println("roll no" + rollno);
	System.out.println("name" +name);
}


public static void main(String[] args) {
		Students s =new Students();
		s.rollno=101;
		s.name="rushi";
		s.display();
		
	}

}

