package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapMethods {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> ls1=new HashMap<>();
		ls1.put(1, 10);
		ls1.put(2, 20);
		ls1.put(3, 30);
		
		HashMap<Integer,Integer> ls2=new HashMap<>();
		ls2.put(3, 30);
		ls2.put(4, 40);
		ls2.put(5, 50);
		
		System.out.println("Is ls1 contains key 2: "+ls1.containsKey(2));
		
		System.out.println("Is ls2 contains value 50: "+ls2.containsValue(50));
		
		System.out.println("Size of ls1 is: "+ls1.size());
		
		System.out.println("Is ls1 is empty?: "+ls1.isEmpty());
		
		System.out.println("value of key 4 is: "+ls2.get(4));
		
		ls2.remove(3);
		
		System.out.println("After removal of objet of key 3, remaining objects are: "+ls2);
		
		ls1.putAll(ls2);

		System.out.println("After adding ls2 into ls1, result is: "+ls1);
		
		
	}

}
