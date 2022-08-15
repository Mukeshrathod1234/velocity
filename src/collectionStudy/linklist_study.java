package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linklist_study {

	public static void main(String[] args) {
		
		LinkedList ll= new LinkedList();
		
		ll.add("Pune");
		ll.add('A');
		ll.add(123);
		ll.add(123.12);
		ll.add(true);
		ll.add(123);
		ll.add(null);
		ll.add(null);

		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(3));
		System.out.println(ll.peek());//show first element
		System.out.println(ll);
		System.out.println(ll.peekFirst());// first element
		System.out.println(ll.peekLast());// last element
		System.out.println(ll.poll());// show and delete first element
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());//show and delate last eelement
		System.out.println(ll);
		
		// for each loop 
		System.out.println("for each loop output");
		for(Object k:ll)
		{
			System.out.println(k);
		}
		// iterator
		System.out.println("output of iterator");
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//list iterator
		System.out.println("list iterator output");
		ListIterator li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
			}

}
