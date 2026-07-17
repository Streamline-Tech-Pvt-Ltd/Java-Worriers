package rushi.main.constructorClass;

class ObjInitilizationMethod {
	int rollno;
	String name;
	
	void getData(int r,String n) {
		rollno=r;
		name=n;
		
	}
	void display(){
		System.out.println("rollno :" +rollno);
		System.out.println("name :" +name);
	}

	public static void main(String[] args) {
		ObjInitilizationMethod obj = new ObjInitilizationMethod();
		obj.getData(101, "Rushi");
		obj.display();

	}

}
