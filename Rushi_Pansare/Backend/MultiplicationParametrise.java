package rushi.main.constructorClass;

 class MultiplicationParametrise {
	 void multiplication(int a, int b) {
		 System.out.println("multiplication :" +(a*b));
	 }

	public static void main(String[] args) {
		MultiplicationParametrise obj = new MultiplicationParametrise();
		obj.multiplication(10,2);
		

	}

}
