package streamlinetech.com.task;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("enter first number:");
			int a = sc.nextInt();
			
			System.out.println("enter second number:");
			int b = sc.nextInt();
			
			
			System.out.println("enter Arthmactic opretion number:");
			char oper = sc.next().charAt(0);
			
			switch(oper) 
			{
			   case '+' : System.out.println("addition->" +(a+b));
			             break;
			   case '-': System.out.println("subtraction->" +(a-b));
			             break;
			   case '*': System.out.println("multipication->" +(a*b));
	                      break;
			   case '/': System.out.println("Division->" +(a/b));
	                      break;
			   default : System.out.println("invalid opertor");
			}
	}

}
