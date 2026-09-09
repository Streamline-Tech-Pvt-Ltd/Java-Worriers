package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Queue;

public class arrayDequeue {

	public static void main(String[] args) {
		Queue<Integer> ar = new ArrayDeque<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(1);
		ar.add(1);
//		ar.add(null);
//		ar.add(null);
		ar.add(2);
		
	 // simple printing method
		System.out.println(ar);
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(i);
		}
		for(Integer i:ar)
		{
			System.out.println(i);
		}
              Iterator<Integer> itr = ar.iterator();
             while(itr.hasNext())
             {
           	  System.out.println(itr.next());
             }
             
		// method 
		System.out.println(ar.size());
		System.out.println(ar.contains(1));
		System.out.println(ar.isEmpty());
		System.out.println(ar.remove(1));
		System.out.println(ar.equals(ar));
		ar.clear();
		System.out.println(ar);
		System.out.println(ar.);
		
	}

}
