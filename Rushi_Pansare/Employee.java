package com.main.collactions;
import java.io.ObjectInputStream.GetField;
import java.util.*;


public class Employee {
		public static void main(String[] args) {
			List<String> names = new LinkedList<>();
			
			names.add("Rahul");
			names.add("om");
			names.add("Rahul");
			//names.set(0,"rushi");
			//names.remove(2);
			
			
			
			//for (String name : names) {  // for loop
			System.out.println(names.get(0));
				System.out.println(names.get(1));
				System.out.println(names.get(2));
			//}
		}

}
