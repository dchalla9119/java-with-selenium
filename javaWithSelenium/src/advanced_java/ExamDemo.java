package advanced_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExamDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		list.add(25);
		list.add(456);
		list.add(1);
		list.add(24);
		list.add(25);
		list.add(456);
		list.add(1);
		list.add(24);
		list.add(25);
		list.add(456);
		list.add(1);
		list.add(24);
		//arraylist allows duplicate elements.
			
		//remove duplicate elements what should we do?
		//<> this is called diamond operator. generic type. we can remove this no problem
		//case1: hashset doesnt allow duplicate
		Set set = new HashSet(list);
		System.out.println(set);//output = [1, 456, 24, 25]
		
		//case2: linkedhashset doesnt allow duplicate
		Set set1 = new LinkedHashSet<>(list);
		System.out.println(set1);//output = [25, 456, 1, 24]  //inseption order is preserved.
		
		//case3
		Set set2 = new TreeSet<>();
		for(int i=0; i<list.size(); i++)
		{
			Object object = list.get(i);
			set2.add(object);
		}
		System.out.println(set2);//output = [1, 24, 25, 456] //we can remove duplicate//inspection order is not preserved
		
		//case4: i want removed duplicate elements
		Set set3 = new TreeSet();
		List duplicates = new ArrayList<>();
		for(int i=0; i<list.size(); i++)
		{
			Object obj = list.get(i);
			boolean status = set3.add(obj);
			if (status) {
				;;;
			}
			else {
				duplicates.add(obj);
			}
		}
	System.out.println("after removing duplicates are: " +set3);//after removing duplicates are: [1, 24, 25, 456]

	System.out.println("removed duplicates are:  " +duplicates);//removed duplicates are:  [25, 456, 1, 24, 25, 456, 1, 24]


		
	}

}
