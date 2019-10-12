package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethods 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ls1=new ArrayList<>();
		ls1.add(10);
		ls1.add(20);
		ls1.add(30);
		
		ArrayList<Integer> ls2=new ArrayList<>();
		ls2.add(30);
		ls2.add(40);
		ls2.add(50);
		
		System.out.println("After adding ls2 in ls1, result is: "+ls1.addAll(ls2));
		
		System.out.println("Is ls1 contains 20? "+ls1.contains(20));
		
		System.out.println("Is ls1 contains all elements of ls2? "+ls1.containsAll(ls2));
		
		System.out.println("Index of object 40 in ls2 is: "+ls2.indexOf(40));
		
		System.out.println("Accessing objects of ls1 using for each loop");
		
		for(Integer i:ls1)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Accessing objects of ls1 using Iterator");
		
		Iterator<Integer> i=ls1.iterator();
		
		while(i.hasNext())
		{
		  System.out.println(i.next());	
		}
		
       
		System.out.println("Accessing objects of ls1 in reverse order using ListIterator");
		
		ListIterator<Integer> li=ls1.listIterator();
		
		while(li.hasNext())
		{
		  System.out.println(li.next());	
		}
		
		
		System.out.println("Accessing objects of ls1 using get() method");
		
		for(int j=0;j<ls1.size();j++)
		{
			System.out.println(ls1.get(j));
		}
		
		ls2.remove(0);

		System.out.println("Elements of ls2 after removing 30 is: "+ls2);
		
		ls1.removeAll(ls2);
		
		System.out.println("Elements remained in ls1 after removing all the elements of ls2 are: "+ls1);
		
		ls1.retainAll(ls2);	
		
		System.out.println("Elements remained in ls1 after retaining common elements of ls2 are: "+ls1);
		
		System.out.println("Is array list ls1 is empty? :"+ls1.isEmpty());
		
		System.out.println("Size of the objects in array list ls1 is: "+ls1.size());
		
		System.out.println("Is ls2 have all objects of ls1?:"+ls1.equals(ls2));
	}
}
