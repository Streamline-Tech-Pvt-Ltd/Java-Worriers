package OOPS;

public class Over extends OverRide {
void eat() {
	super.eat();
	System.out.println("The dog is eating");
	
}
	public static void main(String[] args) {
		Over o = new Over();
		o.eat();
	}

}
