package com.main.collactions;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args) {
		TreeSet<Integer> set= new  TreeSet<Integer>();
	
		set.add(4);
//		fruts.add("Mango");
//		fruts.add("banana");
		set.add(1);
		set.add(2);
//		fruts.add("apple");
		
		for (Integer sets: set) {
			System.out.println(sets);
		}
		
	}

}
