package advanced_java;

import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector vector = new Vector<>();//we will not use this classes in real time because this are legacy classes(old classes)
	vector.add(456);
	vector.add(0, "job");
	vector.addElement("salary");
	vector.add(456);
	vector.add(91456);
	vector.add(456);
	vector.add(0, "job");
	vector.addElement("salary");
	vector.add(456);
	vector.add(91456);
	vector.add(null);
	
	System.out.println(vector);
	
	Object obj = vector.firstElement();
	System.out.println(obj);


}
}
