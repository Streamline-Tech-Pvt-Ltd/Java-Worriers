package streamlinetech.com.program;

abstract class Bank{
	abstract int getRateOfInerset();
}

class SBI extends Bank{
	int getRateOfInerset() {
		return 7;
	}
}

class Hdfc extends Bank{
	int getRateOfInerset() {
		return 8;
	}
}

public class Abstraction {
   public static void main(String [] args){
	   Bank b1 = new SBI();
	   System.out.println("SBI rate of inerset: "+b1.getRateOfInerset()+"%");
	   
	   Bank b2 = new Hdfc();
	   System.out.println("HDFC rate of inerset: "+b2.getRateOfInerset()+"%");
	   
   }
}
