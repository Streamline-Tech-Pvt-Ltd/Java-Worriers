package PRA;

public class Fibional {

	public static void main(String[] args) {
		int a=0,b=10,c;
		for(int i=0;i<=10;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
