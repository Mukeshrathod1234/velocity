package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy_eg_1 {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();//created object of arraylist
		
		al.add("velocity");
		al.add(199);
		al.add(19.99);
		al.add(null);
		al.add(null);
		al.add("velocity");
		al.add(true);
		al.add('A');
		
		System.out.println(al);
		System.out.println("===================");
		//for size
		System.out.println(al.size());
		System.out.println("===================");
		// for index
		
		System.out.println(al.indexOf(19.99));
		System.out.println("===================");
		
		//for get method means search with the help of index
		
		System.out.println(al.get(7));
		System.out.println(al.get(0));
		System.out.println(al.get(5));
		System.out.println(al.get(2));
		
		System.out.println("======================");
		
		//total index method
		
		System.out.println(al.indexOf(true));
		System.out.println(al.indexOf("velocity"));
		System.out.println(al.lastIndexOf("velocity"));
		System.out.println("===========================");
		
		//contains method
		
		System.out.println(al.contains("velocity"));
		System.out.println(al.contains("mukesh"));
		System.out.println("====================");
		
		// remove method
		
		System.out.println(al.remove(0));// index besis 
		System.out.println(al);
		System.out.println("===================");
		
		//add method
		
		al.add(1, "arvind");
		System.out.println(al);
		System.out.println("==================");
		
		//remove method 
		System.out.println(al.remove(null));
		System.out.println(al);
		System.out.println("==================");
		
		
		// print element using for loop
		System.out.println("output of for loop");
		
		for (int i=0;i<=6;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("===================");
		
		//  for each loop
		System.out.println("output of for each loop");
		
		for (Object m:al)
		{
			System.out.println(m);
		}
		
		System.out.println("===================");
		// iterator
		
		System.out.println("output of iterator");
		// using iterator first we create object of iterator
		
		Iterator it = al.iterator();// create object for iterator 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 System.out.println("===================");
		 // list iterator
		 
		 System.out.println("output of list operator");
		// using listiterator first we create object of listiterator
		 
		 ListIterator li = al.listIterator();
		 
		 while(li.hasNext())
		 {
			 System.out.println(li.next());
		 }
		 System.out.println("===================");
		 
		 
	}
}
