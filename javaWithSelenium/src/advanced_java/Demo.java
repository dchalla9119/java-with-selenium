package advanced_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		
//		{
//		List list = new ArrayList<>();
	//	
//		list.add(456);
//		list.add(56);
//		list.add(1);
	//	
	//	
//		Iterator iterator = list.iterator();
	//	
//		while(iterator.hasNext())
//		{
//			Object obj = iterator.next();
//			Integer i = (Integer) obj;//type casting is mandatory
//			if(i==456)
//			{
//				System.out.println("hello");
//			}
//			System.out.println(i);
//		}
//		}
		
		
		
		
		Set<String> set = new HashSet<>();//Generic collection object  //it is typecase. it can hold only same type of elements
		//one hashset object got created
		set.add("hello");
		set.add("java");
		set.add("abc");
		set.add("selenium");
		//set.add(456);//this set takes only string. if we take other than string we will get compile time error
		for(String str : set)
		{
			if(str.equalsIgnoreCase("java"))
			{
				System.out.println("java is important");
			}
			System.out.println(str);
		}//type casting is not required for generics. we are not doing any type casting here
		
		
		Set<Integer> set1 = new HashSet<>();//Generic collection object
		//one hashset object got created
		//set1.add("hello");//this set takes only integer. if we take other than integer we will get compile time error
		//set1.add("java");//this set takes only integer. if we take other than integer we will get compile time error
		//set1.add("abc");//this set takes only integer. if we take other than integer we will get compile time error
		set1.add(123);
		set1.add(456);
		
		
		
		
		
		//Map<String, Integer> map = new LinkedHashMap<>();//valid
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();//valid //here String is key and Integer is value
		//Map<String, Integer> map = new LinkedHashMap();//valid  //these 3 forms are valid
		//key should be string value should be integer
		
		//map.put("hello", "java");//we will get compile time error //key should be string value should be integer
		map.put("hello", 456);
		map.put("java", 91456);
		map.put("selenium", 91);
		System.out.println(map);
		
		
		
		
		
	}

}
