package rushi.main.constructorClass;

class Animal{
	void sound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
	void fetch() {
		System.out.println("Dog fetch ball");
	}
}
public class Downcasting {

	public static void main(String[] args) {
		//downcasting
//		Dog d=(Dog) d;
//		d.sound();
//		d.fetch();
//		
		//Upcasting
		Animal a= new Dog();
		a.sound();
		
	}

}
