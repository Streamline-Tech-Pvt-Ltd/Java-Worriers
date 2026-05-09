package rushi.main.demo;

public class PrivateAcessmodifier {

	private int a = 10;
	int d = 30;
	protected int c = 12;
	public int b = 20;

	public static void main(String[] args) {

		PrivateAcessmodifier obj = new PrivateAcessmodifier();

		System.out.println("Private" + " " + obj.a);
		System.out.println("Public" + " " + obj.b);
		System.out.println("Protected" + " " + obj.c);
		System.out.println("default" + "  " + obj.d);
	}

}
