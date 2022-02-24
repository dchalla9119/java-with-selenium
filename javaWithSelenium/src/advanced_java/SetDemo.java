package advanced_java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
//		{
//		Set set = new HashSet<>();
//		HashSet hs = new HashSet();
//		System.out.println(hs.add(456));//true
//		System.out.println(hs.add(456));//false      it dont take duplicate values
//		System.out.println(hs.add('d'));
//		System.out.println(hs.add("job"));
//		System.out.println(hs.add(456));
//		System.out.println(hs.add("job"));
//		System.out.println(hs.add(456));
//		System.out.println(hs.add("salary"));
//		System.out.println(hs.add(null));
//		System.out.println(hs);
//		}
		
		
		//Set set = new HashSet<>();
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet<>();
		System.out.println(hs.add(456));//true
		System.out.println(hs.add(456));//false      it dont take duplicate values
		System.out.println(hs.add('d'));
		System.out.println(hs.add("job"));
		System.out.println(hs.add(456));
		System.out.println(hs.add("job"));
		System.out.println(hs.add(456));
		System.out.println(hs.add("salary"));
		System.out.println(hs.add(null));
		System.out.println(hs);

	}

}
