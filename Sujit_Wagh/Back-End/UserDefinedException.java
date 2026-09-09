package Exception;

import java.util.Scanner;



public class UserDefinedException {
	

	public static void main(String[] args) {
		UserDefinedException u = new UserDefinedException();
		try {
			u.Register(55);
		}catch (InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		}
	public void Register(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Please valid input");
		}
		System.out.println("Register sucesfully");
	}
}

