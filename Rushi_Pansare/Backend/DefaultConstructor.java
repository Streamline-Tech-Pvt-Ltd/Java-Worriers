package rushi.main.constructorClass;

public class DefaultConstructor {
	String name;
	int age;
	DefaultConstructor(){
		name ="rushi";
		age=22;
		}
	 void display() {
		 System.out.println("name "+name);
		 System.out.println("age:"+age);
		 
	 }

	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		obj.display();

	}

}
