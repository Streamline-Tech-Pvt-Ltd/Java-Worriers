package streamlinetech.com.program;

class A{
	String name = "Animal";
}

class B extends A{
	String name = "Dog";
	
	void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class Supers {

	public static void main(String[] args) {
		B d = new B();
		d.display();

	}

}
