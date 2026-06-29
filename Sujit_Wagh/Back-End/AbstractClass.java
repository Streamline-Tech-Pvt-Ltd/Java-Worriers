package Abstraction;
abstract class Vechicle{
	public void hank() {
		System.out.println("Beep Beep");
	}
	public abstract void move();
	
}
 class Car extends Vechicle{

	@Override
	public void move() {
		System.out.println("The move the car");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		Car  c = new Car();
		c.hank();
c.move();
	}

}
