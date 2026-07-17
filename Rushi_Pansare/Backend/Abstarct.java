package rushi.main.constructorClass;

abstract class Bank{
	abstract int getRateOfIntrest();
}
 class SBI extends Bank {

	int getRateOfIntrest() {
		return 7;
	}

}
class HDFC extends Bank{
	int getRateOfIntrest() {
		return 8;
	}
}
public class Abstarct {

	public static void main(String[] args) {
		Bank b1 =new SBI();
		Bank b2= new HDFC();
		System.out.println("SBI interest rate is : +"+b1.getRateOfIntrest()+"%");
		System.out.println("SBI interest rate is : +"+b2.getRateOfIntrest()+"%");
	}

}
