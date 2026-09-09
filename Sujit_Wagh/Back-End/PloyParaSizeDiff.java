package OOPS;

public class PloyParaSizeDiff {
	void add(int a) {
		System.out.println("The addtiton of a is"+" "+a);
		
	}
	void add(int a, int b)
	{
		System.out.println("The addition of a+b is"+" "+(a+b));
		
	}
	void add(int a, int b, int c)
	{
		System.out.println("The addition of a+b+c is"+" "+(a+b+c));
	}

	public static void main(String[] args) {
		PloyParaSizeDiff p = new PloyParaSizeDiff();
		p.add(10,20,20);

	}

}
