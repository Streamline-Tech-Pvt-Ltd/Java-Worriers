package streamlinetech.com.task;

public class ThisObject {
	
	int a;
	String s;
	
	ThisObject(int a, String s){
		this.a = a;
		this.s = s;
	}

	void display() {
		 System.out.println(a);
		 System.out.println(s);
	}

	
	public static void main(String[] args) {
		
		ThisObject obj = new ThisObject (10,"hari");
		obj.display();

	}

}
