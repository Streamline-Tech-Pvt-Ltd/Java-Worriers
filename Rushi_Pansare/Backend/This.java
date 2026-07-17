package rushi.main.constructorClass;

 class This {
	 int id;
	 String name;
	 This (int id,String name){
		 this.id=id;             //important point
		 this.name=name;
	 }
	 void display() {
		 System.out.println("id :"  +id);
		 System.out.println("name :" +name);
	 }
	 
	public static void main(String[] args) {
		This obj =new This (1,"ram");
		obj.display();
	} 

}
