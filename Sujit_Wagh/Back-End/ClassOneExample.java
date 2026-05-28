package Str;

public class ClassOneExample {
int id=1;
String name ="kiran";
int age =21;
int mno =78540;
String add="newasa";


	public static void main(String[] args) {
		ClassOneExample c1 = new ClassOneExample();
		ClassOneExample c2 = new ClassOneExample();
		
		System.out.println("*** Student 1 informaction ***");
		System.out.println("Id"+" "+c1.id);
		System.out.println("Name"+" "+c1.name);
		System.out.println("Age"+" "+c1.age);
		System.out.println("Mobile No"+" "+c1.mno);
		System.out.println("Address"+" "+c1.add);
	System.out.println();
	System.out.println("*** Student 2 informaction ***");
	System.out.println("Id"+" "+c2.id);
	System.out.println("Name"+" "+c2.name);
	System.out.println("Age"+" "+c2.age);
	System.out.println("Mobile No"+" "+c2.mno);
	System.out.println("Address"+" "+c2.add);
	}

}
