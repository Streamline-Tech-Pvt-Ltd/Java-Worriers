package rushi.main.constructorClass;

public class Car {
	String brand;
	int price;
	
	Car(String b,int p){
		brand =b;
		price =p;
	}
	void display() {
		System.out.println("brand:" +brand);
		System.out.println("price:" +price);
	}
	public static void main(String[] args) {
		Car obj =new Car("bmw",40000);
		obj.display();

	}

}
