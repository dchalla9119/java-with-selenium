package advanced_java;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		//Queue queue = new PriorityQueue<>();//this is one way
		
		PriorityQueue queue = new PriorityQueue<>();
		queue.add("hello");
		queue.add("demo");
		queue.add("abc");
		queue.add("java");
		//queue.add(null);//we will get exception if we add null
		//even for empty queue also we will get exception
		//it will take only homogeneious dont allow heterogenious
		
		System.out.println(queue);
		
		
		
		
	}

}
