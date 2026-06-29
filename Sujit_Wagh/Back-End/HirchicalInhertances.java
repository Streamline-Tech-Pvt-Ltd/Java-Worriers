package src.in.sp;
class Vechal{
	void start() {
		System.out.println("The vechical is start");
	}
}
class Car extends Vechal {
	void drive() {
		System.out.println("The car is drive");
	}
}
class Bike extends Vechal{
	void run()
	{
		System.out.println("The bicke is run");
	}
}
public class HirchicalInhertances {

	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		c.start();
		c.drive();
		
		b.start();
		b.run();
	}

}
