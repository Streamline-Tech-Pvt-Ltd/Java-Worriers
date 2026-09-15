package streamlinetech.com.program;

interface inter {
	 void amethod();
	 int x = 10;
}

class Test implements inter{
	public void amethod() {
		System.out.println("method implement.....");
	}
}

public class Interface {

	public static void main(String[] args) {
		Test obj = new Test();
		obj.amethod();
		

	}

}
