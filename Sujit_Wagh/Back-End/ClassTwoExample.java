package Str;

public class ClassTwoExample {
	int id;
	String name;
	int age ;
	long mno ;
	String add;

	public static void main(String[] args) {
		ClassTwoExample c1 = new ClassTwoExample();
		ClassTwoExample c2 = new ClassTwoExample();
		ClassTwoExample c3 = new ClassTwoExample();
		
		System.out.println("*** Student 1 informaction ***");
		c1.id=1;
	    c1.name="sagar";
		 c1.age=22 ;
		 c1.mno =7249027955l;
		c1.add="nagar";
		System.out.println("Id"+": "+c1.id);
		System.out.println("Name"+" :"+c1.name);
		System.out.println("Age"+" :"+c1.age);
		System.out.println("Mobile No"+": "+c1.mno);
		System.out.println("Address"+" :"+c1.add);
		
		System.out.println(" *** Student 2 Informaction");
		c2.id=2;
	    c2.name="onkar";
		 c2.age=23 ;
		 c2.mno =70580649l;
		c2.add="akole";
		System.out.println("Id"+": "+c2.id);
		System.out.println("Name"+" :"+c2.name);
		System.out.println("Age"+" :"+c2.age);
		System.out.println("Mobile No"+": "+c2.mno);
		System.out.println("Address"+" :"+c2.add);
		
		System.out.println(" *** Student 3 Informaction");
		c3.id=3;
	    c3.name="sujit";
		 c3.age=22 ;
		 c3.mno =9284724766l;
		c3.add="Newasa";
		System.out.println("Id"+": "+c3.id);
		System.out.println("Name"+" :"+c3.name);
		System.out.println("Age"+" :"+c3.age);
		System.out.println("Mobile No"+": "+c3.mno);
		System.out.println("Address"+" :"+c3.add);
	}

}
