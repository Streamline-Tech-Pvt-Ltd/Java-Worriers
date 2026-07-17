package rushi.main.constructorClass;

public class Addition {
	void add(int a,int b) {
		System.out.println("addition : " +(a+b));
	}
	void add(double a,double b) {
		System.out.println("addition doubles :" +(a+b));
	}
	void add(int a, int b,int c ) {
		System.out.println("additions are :" +(a+b+c));
	}

	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(2, 3);
		obj.add(11, 22);
		obj.add(1, 2,3);
	}

}
