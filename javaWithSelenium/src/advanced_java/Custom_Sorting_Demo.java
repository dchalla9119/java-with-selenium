package advanced_java;

import java.util.Comparator;
import java.util.TreeSet;

public class Custom_Sorting_Demo implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		System.out.println("111111111");
		String str1 = (String) arg0;
		String str2 = (String) arg1;
		
		//return str1.compareTo(str2);//asscending order
		//return -str1.compareTo(str2);//descending order
		//return str2.compareTo(str1);//descending order
		return -str2.compareTo(str1);//asscending order
	}

	
public static void main(String[] args) {
	Custom_Sorting_Demo comparator = new Custom_Sorting_Demo();
	TreeSet ts = new TreeSet<>(comparator);
	ts.add("hello");
	ts.add("abcv");
	ts.add("java");
	ts.add("practice");
	System.out.println(ts);
	
}

}
