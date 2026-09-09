package main.in.sp;

import java.util.LinkedList;

public class LinkedListNullValueAlloed {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(null);
		link.add(null);
		link.add(null);
		System.out.println(link);
		
	}

}
