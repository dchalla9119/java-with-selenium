package advanced_java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class CursorsDemo {
	public static void main(String[] args) {
		
//		Object obj1 = "hello";
//		String s1 = "job";
//		Object o2 = s1;//implicit type casting
	//	
//		//String s2 = obj1;//explicit type casting. so we have to follow explicit type casting
//		String s2 = (String) obj1;//explicit type casting
		
		Vector vector = new Vector<>();//from this vector object i want to retrive elements one by one
		//Stack vector = new Stack<>();//in place of vector we can use stack no problem. we can retrive the elements
		//ArrayList vector = new ArrayList<>();//using arraylist we cannot retrive the the elements. enumeration is not possible
		//because enumeration is applicable only for legacy classes
		vector.add("hello");
		vector.add("java");
		vector.add("job");
		vector.add("selenium");
		
		Enumeration enumeration = vector.elements();
		
		while(enumeration.hasMoreElements()) {
			Object obj = enumeration.nextElement();//gives next element
			String str = (String) obj;//string cannot hold object, so we are type casting
			if (str.equalsIgnoreCase("job"))
			{
				System.out.println(" u r doing practice");
			}
			System.out.println(str);
		}
		
		
		
	}

}
