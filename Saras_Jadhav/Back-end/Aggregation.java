package streamlinetech.com.program;

class Engin{
	void start() {
	  System.out.println("Engine started...");
}
}

class Cars{
	Engin engine;
	
	Cars(Engin engine) {
		this.engine = engine;
	}
	
	void drive() {
		engine.start();
		System.out.println("car is running...");
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Engin e = new Engin();
		
		Cars c = new Cars(e);
		
		c.drive();
		
	}

}
