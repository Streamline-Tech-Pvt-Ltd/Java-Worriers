package OOPS;

public class PloyParaSequChange {
	void num(int a, double b) {
		System.out.println("The number is "+" "+a+b);
		
	}
	void num(double a , long b) {
		System.out.println("The number is"+" "+a+b);
		
	}

	public static void main(String[] args) {
		PloyParaSequChange p = new PloyParaSequChange();
		p.num(10.4,45122l);

	}

}
