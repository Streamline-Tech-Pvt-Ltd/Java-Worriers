package streamlinetech.com.program;


	
interface Vehical{
		
	  interface Engine{
			  
			  void start();
			  
		  }
	}

	
class NestedInterface implements Vehical.Engine{
		 
		public void start() {
			 System.out.println("car start..");
		 }
		
		public static void main(String[] args) {
			
			Vehical.Engine car= new  NestedInterface();
			
			car.start();
			
			
		}
}
	

