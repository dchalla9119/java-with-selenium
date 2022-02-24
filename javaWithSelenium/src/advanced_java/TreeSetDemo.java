package advanced_java;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet<>();
		ts.add(56);//this treeset by default follows ascending nature
		ts.add(5612);
		ts.add(1);
		ts.add(23);
		ts.add(56);
		//ts.add("hello");//we will get exception. treeset only take homogenious elements
		//ts.add(null);//we will get null pointer exception. we cannot add null value in TreeSet. for empty treeset also doesnt allow null values
		//ts.add(null);//we will get null pointer exception. we cannot add null value in TreeSet. for empty treeset also doesnt allow null values
		
		System.out.println(ts);
		//output = [1, 23, 56, 5612]; inspection is asscending order, duplicate is not allowed
		//internally JVM do sorting by comparitive mechanism
		//here sorting nature happens on comparable interface
		//treeset allows only homogenious doesnt allows heterogenious
		TreeSet ts1 = new TreeSet();
		ts1.add("hello");
		ts1.add("java");
		ts1.add("dileep");
		ts1.add("abc");
		ts1.add("zebra");
		ts1.add("hello");
		ts1.add("hike");
		//ts1.add(45);//we will get exception. treeset only take homogenious elements
		System.out.println(ts1);
		//output = 	[abc, dileep, hello, hike, java, zebra]; inspection is asscending order, duplicate is not allowed
		
		
	}

}
