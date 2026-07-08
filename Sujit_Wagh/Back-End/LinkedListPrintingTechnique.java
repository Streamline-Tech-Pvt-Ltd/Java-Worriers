package main.in.sp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPrintingTechnique {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(1);
		link.add(5);
		link.add(8);
		link.add(6);
		link.add(10);
		link.add(4);
		System.out.println(link);
		for(int i=0;i<link.size();i++)
		{
			System.out.println(i);
		}
		for(int li:link)
		{
			System.out.println(li);
		}
		Iterator<Integer> itr=link.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
      ListIterator<Integer> itr1 =link.listIterator();
      while(itr1.hasNext())
      {
         System.out.print(itr1.next());    	  
      }
      System.out.println();
      while(itr1.hasPrevious())
      {
    	  System.out.print(itr1.previous());
      }
	}

}
