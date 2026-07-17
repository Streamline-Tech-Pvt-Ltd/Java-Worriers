package rushi.main.constructorClass;

public class Demo {
	Demo(){
		System.out.println("object created");
	}
	void show() {
		System.out.println("method called");
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.show();
	}

}
