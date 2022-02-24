package advanced_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class CursorsListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		//HashSet al = new HashSet<>();//in place of arraylist if use hashset wewill get compile time error
		//listiterator is applicable only for list type, it is not applicable for set and maps
		al.add(456);
		al.add(1456);
		al.add(789);
		al.add(91456);
		al.add(1456);
		al.add(456);
		
		ListIterator itr = al.listIterator();
		
		while(itr.hasNext())//if the element is there give me that element
		{
			Object obj = itr.next();
			Integer i = (Integer) obj;//integer cannot hold object so we do type casting
			if (i==91456)
			{
				System.out.println("hello");
			}
			System.out.println(i);
		}
		
		
	}

}
