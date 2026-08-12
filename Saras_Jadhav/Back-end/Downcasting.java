package streamlinetech.com.program;

class Parents {
	void sound() {
		System.out.println("Animal make sound..");
	}
}
class Childs extends Parents{
	void fetch() {
		System.out.println("dog fetch ball...");
	}
	void sound() {
		System.out.println("Dog bark");
	
	}
}

public class Downcasting {

	public static void main(String[] args) {
		
		Parents a = new Childs();
		a.sound();
		
		Childs d = (Childs) a;
		d.sound();
		d.fetch();
	}

}
