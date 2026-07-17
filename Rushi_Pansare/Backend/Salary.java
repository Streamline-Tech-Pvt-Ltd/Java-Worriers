package rushi.main.constructorClass;

public class Salary {
	int CalculateSalary(int bonus,int basic) {
		return bonus+basic;
	}

	public static void main(String[] args) {
		Salary obj = new Salary();
		int total =obj.CalculateSalary(2000, 3000);
		System.out.println("total salary : "  +total);

	}

}
