package main.in.sp;

import java.util.LinkedList;

public class LinkedListMethod {

	public static void main(String[] args) {
		LinkedList<Object> link = new LinkedList<Object>();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(5);
		link.add(6);
		link.add(7);
		link.add(8);
		link.add(9);
		link.add(10);
		System.out.println("The Preting Size of LinkedList "+" "+link.size());
		System.out.println("Get Element Of Linked List"+" "+link.get(5));
		System.out.println("Set Element Of linked List"+" "+link.set(4, 11));
		System.out.println("Get Last Index"+" "+link.getLast());
		System.out.println("Get First Element "+" "+link.getFirst());
		System.out.println("List IndexOf"+" "+link.lastIndexOf(10));
//		System.out.println("Remove ELement of linked List"+" "+link.removeAll(link));
		System.out.println(link);
		System.out.println("Remove Element in first index "+" "+link.remove(0));
		System.out.println(link);

	}

}
