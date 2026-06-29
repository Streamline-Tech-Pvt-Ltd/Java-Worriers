package Polymorphsim;

class Vechical{
	void Sound() {
		System.out.println("The big sound");
	}
}
class Bike extends Vechical{
	void sound() {
		System.out.println("The small Sound");
	}
}
public class PloyMorphsimOveride {

	public static void main(String[] args) {
	Bike b = new Bike();
	b.sound();
	b.Sound();

	}

}
