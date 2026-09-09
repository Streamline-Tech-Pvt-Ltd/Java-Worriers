package streamlinetech.com.program;

class Parent {
	void sound() {
		System.out.println("Animal make sound..");
	}
}
class Child extends Parent{
	void fetch() {
		System.out.println("dog fetch ball...");
	}
	void sound() {
		System.out.println("Dog bark");
	
	}
}

public class Upcasting {

	public static void main(String[] args) {
		
		Parent a = new Child();
		a.sound();
		

	}

}
