package main.in.sp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("Python");
		al.add("MYSQL");
		al.add("PHP");
		al.add("Java");
		al.add("SpringBoot");
		al.add("Python");
		al.add("MYSQL");
		al.add("PHP");
		al.add("SpringBoot");
		//System.out.println(al);
		System.out.println("The arraylist size is"+" "+al.size());
		System.out.println("Get Element in Index "+" "+al.get(7));
		System.out.println("Remove the element in index"+" "+al.remove(3));
		System.out.println("Remove the element by name"+" "+al.remove("SpringBoot"));
		System.out.println("Set Element "+" "+al.set(5, "SpringBoot"));
		System.out.println("Check Set is Empty"+" "+al.isEmpty());
		System.out.println("The Contains values"+" "+al.contains("MYSQL"));
		System.out.println("Reversed Order"+" "+al.reversed() );
		System.out.println("Index of name"+" "+al.indexOf("SpringBoot"));
		System.out.println("Last Index Find"+" "+al.lastIndexOf("SpringBoot"));
System.out.println("Forward Order "+" "+al);
Collections.reverse(al);
		System.out.println("Collection Reverse Order"+" "+al);

	}

}
