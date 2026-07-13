package Queue;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(1);
		pq.add(2);
		pq.add(1);
		pq.add(2);
//		pq.add(null);
//		pq.add(null);
		pq.add(-44);
		pq.add(30);
	System.out.println(pq);
		for(int i=0;i<pq.size();i++)
		{
			System.out.println(i);
		}
		// printing in for each loop
		for(Integer i:pq)
		{
			System.out.println(i);
		}
		Iterator<Integer> itr =  pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(pq.remove(1));
		System.out.println(pq.contains(1));
	System.out.println(pq.isEmpty());
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq);
	

	}

}
