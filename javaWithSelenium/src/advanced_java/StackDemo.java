package advanced_java;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	//Vector vector = new Vector<>();//we will not use this classes in real time because this are legacy classes(old classes)
	Stack stack = new Stack();//stack is child class of vector
	stack.add(456);
	stack.add(0, "job");
	stack.addElement("salary");
	stack.add(456);
	stack.add(91456);
	stack.add(456);
	stack.add(0, "job");
	stack.addElement("salary");
	boolean status = stack.add(456);
	System.out.println(status);
	stack.add(456);
	stack.add(91456);
	stack.add(null);
	stack.push("salary is imp");
//	
	System.out.println(stack);
//	
	Object obj = stack.firstElement();
	System.out.println(obj);

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
//
