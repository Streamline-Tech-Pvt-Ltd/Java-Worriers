package rushi.main.constructorClass;

class A {
	void print(A obj) {
		System.out.println("object passed");

	}

	void call() {
		print(this);

	}
	
	public  static void main(String[] args){
		 A obj= new A();


		}
	
	
}


