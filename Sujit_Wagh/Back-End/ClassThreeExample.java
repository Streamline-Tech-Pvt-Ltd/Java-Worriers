package Str;

import java.util.Scanner;

public class ClassThreeExample {
	int id;
	String name;
	int age ;
	long mno ;
	String add;

	public static void main(String[] args) {
		ClassThreeExample c1 = new ClassThreeExample();
		ClassThreeExample c2 = new ClassThreeExample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student informaction");
		System.out.println("Enter the student id ");
		c1.id=sc.nextInt();
		System.out.println("Enter the student name");
		c1.name = sc.next();
		System.out.println("Enter the student age");
		c1.age=sc.nextInt();
		System.out.println("Enter the student mno");
		c1.mno=sc.nextLong();
		System.out.println("Enter the student address");
		c1.add=sc.next();
		System.out.println();
		System.out.println("*** Student Informaction ***");
		System.out.println("Enter the student id ");
		c2.id=sc.nextInt();
		System.out.println("Enter the student name");
		c2.name = sc.next();
		System.out.println("Enter the student age");
		c2.age=sc.nextInt();
		System.out.println("Enter the student mno");
		c2.mno=sc.nextLong();
		System.out.println("Enter the student address");
		c2.add=sc.next();
		System.out.println("*** Student Informaction ***");
		System.out.println("Id"+" :"+c1.id);
		System.out.println("Name"+":"+c1.name);
		System.out.println("Age"+": "+c1.age);
		System.out.println("Mobile No0"+" :"+c1.mno);
		System.out.println("Address"+" :"+c1.add);
		System.out.println();
		System.out.println("*** Student Informaction ***");
		System.out.println("Id"+" :"+c2.id);
		System.out.println("Name"+":"+c2.name);
		System.out.println("Age"+": "+c2.age);
		System.out.println("Mobile No0"+" :"+c2.mno);
		System.out.println("Address"+" :"+c2.add);
		
		
		

	}

}
