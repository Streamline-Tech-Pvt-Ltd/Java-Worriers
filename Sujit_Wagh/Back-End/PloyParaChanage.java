package OOPS;

public class PloyParaChanage {
	void PaymentProcess(double a) {
		System.out.println("The payment process"+" "+a);
	}
void PaymantProcess(int a, long b)
{
	System.out.println("The payment process "+" "+a+b);
}
	public static void main(String[] args) {
		PloyParaChanage p = new PloyParaChanage();
		p.PaymantProcess(45, 78965l);

	}

}
