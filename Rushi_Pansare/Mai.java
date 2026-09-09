package com.main.Exception;


enum Status{
	SUCCESFULL,
	FAILED,
	PENDING
}
public class Mai {
	public static void main(String[] args) {
		Status status = Status.SUCCESFULL;
		
		if(status== Status.SUCCESFULL ) 
		{
		System.out.println("sucessfully passed");	
		}
		else if (status == Status.PENDING ) {
			System.out.println("Pending");
			
		}
		else {
			System.out.println("failed");
		}
	}

}
