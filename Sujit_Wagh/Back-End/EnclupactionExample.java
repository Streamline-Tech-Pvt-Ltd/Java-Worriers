package Encaplusaction;
  class Human{
	  private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>18)
			
		{
			
			this.age = age;
			System.out.println("Age valid login sucesfully");
		}else
		{
			System.out.println("Invalid age");
		}
	}
	  
  }


public class EnclupactionExample {

	public static void main(String[] args) {
		Human h = new Human();
		h.setAge(25);
		System.out.println(h.getAge());
		

	}

}
