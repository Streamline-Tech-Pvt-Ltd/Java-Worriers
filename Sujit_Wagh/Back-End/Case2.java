package Case;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("**Your Meanu card**");
		System.out.println("1.Burger"+"\n"+"2.Pizza"+"\n"+"3.coffe"+"\n"+"4Sanks");
		System.out.println("Please enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Your ordered Burger");
			break;
		}
		case 2:{
			System.out.println("Your order Pizza");
			break;
		}
		case 3:
		{
			System.out.println("Your order Coffe");
		}
		case 4:
		{
			System.out.println("Your order Sanks");
			break;
		}
		default :{
			System.out.println("Please enter the valid input");
		}
		
		}
		

	}

}
