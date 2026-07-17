package rushi.main.constructorClass;


class EvenOdd {
	String check (int n) {
		if ( n %2==0) {
	return "even";
		}else {
			return "odd";
		}
	}
	public static void main(String[] args) {
	EvenOdd obj=new EvenOdd();
	System.out.println(obj.check(5));

	}

}
