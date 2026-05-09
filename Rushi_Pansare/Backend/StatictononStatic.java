package rushi.main.demo;

public class StatictononStatic {
	
	public static void main(String[] args) {
		System.out.println("This is Static method");
		
		StatictononStatic obj = new  StatictononStatic();
		obj.add(2,3);
	}
	
	public  void add(int x,int y) {
		System.out.println(x+y);
	}

}
