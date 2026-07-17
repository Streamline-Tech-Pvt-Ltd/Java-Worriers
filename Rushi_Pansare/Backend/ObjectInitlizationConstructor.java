package rushi.main.constructorClass;

 class ObjectInitlizationConstructor {
	 int id;
	 String name;
	 ObjectInitlizationConstructor(int i,String n){
		 id=i;
		 name=n;
	 }
	 void display() {
		 System.out.println("id :"  +id);
		 System.out.println("name :" +name);
	 }
	 
	public static void main(String[] args) {
		ObjectInitlizationConstructor obj =new ObjectInitlizationConstructor(1,"ram");
		obj.display();
	} 

}
