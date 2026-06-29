package Polymorphsim;

class MathOperaction
{
	int add(int a, int b ) {
		return a+b;
	}
	int add(int a,int b, int c)
	{
		return a+b+c;
	}
	double add(double a , double b)
	{
		return a+b;
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		
		MathOperaction math = new MathOperaction();
		System.out.println("The sum of two number is"+" "+math.add(10,20));
		System.out.println("The sum of three nuber is "+""+math.add(12, 15,78));
		System.out.println("The sum two number is"+" "+math.add(41.23, 785.22));
		
		
	}

}
