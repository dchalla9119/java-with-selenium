package advanced_java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {
	public static void main(String[] args) {
		
	//List list = new ArrayList<>();//list object got created with size 16
	//ArrayList al = new ArrayList();//we can write like this also. one arraylist object got created with size 16
//	{
	//Linked List class
	LinkedList al = new LinkedList<>();
//	
	System.out.println(al.add(456));//output = true
	System.out.println(al.add("java"));//output = true
	System.out.println(al.add('d'));//output = true
	System.out.println(al.add("job"));//output = true
	
	System.out.println(al.add(456));//output = true
	System.out.println(al.add("java"));//output = true
	System.out.println(al.add('d'));//output = true
	System.out.println(al.add("job"));//output = true
//	//it allows duplicate values also
//	
//	al.removeLast();
	System.out.println(al.add(null));//it allows null values also   //output = true
//	
	al.add(0, "job is very important");
//	
	System.out.println(al);//output = [job is very important, 456, java, d, job, 456, java, d, job, null]
//	//the 0 index place is now occupied with job is very important and 456 is moved to index place 1, next elements occupies next places.
//
	Object obj = al.get(0);//to get the value
	System.out.println(obj);//ootput = job is very important
//	
	Object obj1 = al.get(5);
	System.out.println(obj1);//ootput = 456
//	}

}
}

//true
//true
//true
//true
//true
//true
//true
//true
//true
//[job is very important, 456, java, d, job, 456, java, d, job, null]
//job is very important
//456
