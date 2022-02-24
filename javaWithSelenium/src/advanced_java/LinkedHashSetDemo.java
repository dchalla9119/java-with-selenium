package advanced_java;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
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
