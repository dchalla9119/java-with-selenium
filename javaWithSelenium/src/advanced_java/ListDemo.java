package advanced_java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		//List list = new ArrayList<>();//list object got created with size 16
		ArrayList al = new ArrayList();//we can write like this also. one arraylist object got created with size 16
		
//		al.add(456);
//		al.add("java");
//		al.add('d');
//		al.add("job");
//		//if these elements added successfully it returns true, if not false
////		{
//		System.out.println(al.add(456));//output = true
//		System.out.println(al.add("java"));//output = true
//		System.out.println(al.add('d'));//output = true
//		System.out.println(al.add("job"));//output = true
//	//	
//		System.out.println(al.add(456));//output = true
//		System.out.println(al.add("java"));//output = true
//		System.out.println(al.add('d'));//output = true
//		System.out.println(al.add("job"));//output = true
////		//it allows duplicate values also
//	//	
//		System.out.println(al.add(null));//it allows null values also   //output = true
//		System.out.println(al);//output = [456, java, d, job, 456, java, d, job, null]
////		}

//		{
//		//this is ArrayList
		System.out.println(al.add(456));//output = true
		System.out.println(al.add("java"));//output = true
		System.out.println(al.add('d'));//output = true
		System.out.println(al.add("job"));//output = true
	//	
		System.out.println(al.add(456));//output = true
		System.out.println(al.add("java"));//output = true
		System.out.println(al.add('d'));//output = true
		System.out.println(al.add("job"));//output = true
//		//it allows duplicate values also
	//	
		System.out.println(al.add(null));//it allows null values also   //output = true
	//	
		al.add(0, "job is very important");
	//	
		System.out.println(al);//output = [job is very important, 456, java, d, job, 456, java, d, job, null]
//		//the 0 index place is now occupied with job is very important and 456 is moved to index place 1, next elements occupies next places.
	//
		Object obj = al.get(0);//to get the value
		System.out.println(obj);//ootput = job is very important
	//	
		Object obj1 = al.get(5);
		System.out.println(obj1);//ootput = 456
//		}
	//}
		
		//List list = new ArrayList<>();//list object got created with size 16
		//ArrayList al = new ArrayList();//we can write like this also. one arraylist object got created with size 16
//		{
		//Linked List class
//		LinkedList al = new LinkedList<>();
	//	
//		System.out.println(al.add(456));//output = true
//		System.out.println(al.add("java"));//output = true
//		System.out.println(al.add('d'));//output = true
//		System.out.println(al.add("job"));//output = true
	//	
//		System.out.println(al.add(456));//output = true
//		System.out.println(al.add("java"));//output = true
//		System.out.println(al.add('d'));//output = true
//		System.out.println(al.add("job"));//output = true
//		//it allows duplicate values also
	//	
//		System.out.println(al.add(null));//it allows null values also   //output = true
	//	
//		al.add(0, "job is very important");
	//	
//		System.out.println(al);//output = [job is very important, 456, java, d, job, 456, java, d, job, null]
//		//the 0 index place is now occupied with job is very important and 456 is moved to index place 1, next elements occupies next places.
	//
//		Object obj = al.get(0);//to get the value
//		System.out.println(obj);//ootput = job is very important
	//	
//		Object obj1 = al.get(5);
//		System.out.println(obj1);//ootput = 456
//		}
		
//		Vector vector = new Vector<>();//we will not use this classes in real time because this are legacy classes(old classes)
//		vector.add(456);
//		vector.add(0, "job");
//		vector.addElement("salary");
//		vector.add(456);
//		vector.add(91456);
//		vector.add(456);
//		vector.add(0, "job");
//		vector.addElement("salary");
//		vector.add(456);
//		vector.add(91456);
//		vector.add(null);
	//	
//		System.out.println(vector);
	//	
//		Object obj = vector.firstElement();
//		System.out.println(obj);
		
		
		
		//Vector vector = new Vector<>();//we will not use this classes in real time because this are legacy classes(old classes)
//		Stack stack = new Stack();//stack is child class of vector
//		stack.add(456);
//		stack.add(0, "job");
//		stack.addElement("salary");
//		stack.add(456);
//		stack.add(91456);
//		stack.add(456);
//		stack.add(0, "job");
//		stack.addElement("salary");
//		boolean status = stack.add(456);
//		System.out.println(status);
//		stack.add(456);
//		stack.add(91456);
//		stack.add(null);
//		stack.push("salary is imp");
//		
//		System.out.println(stack);
//		
//		Object obj = stack.firstElement();
//		System.out.println(obj);

		
		
		
		
		
		
		
		
	}

}
