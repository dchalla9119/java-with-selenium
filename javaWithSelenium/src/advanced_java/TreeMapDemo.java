package advanced_java;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class TreeMapDemo {

	public static void main(String[] args) {
		
		//Map map = new TreeMap<>();//we can represent in below way
		TreeMap map = new TreeMap<>();
		map.put("hello", 456);
		map.put("java", 456);
		map.put("demo", 'd');
		//map.put(456, 'd');//we will get exception. treemap allows sorting nature on keys, keys should be homogenious
		map.put("abc", 456);
		map.put("selenium", 'd');
		//map.put(null, "hello");//null is not allowed. we will get exception
		map.put("job", null);//null is allowed for value. sorting nature happens on keys
		
		System.out.println(map);//{abc=456, demo=d, hello=456, java=456, job=null, selenium=d} 
		//inseption order is not preserved

		Set keySet = map.keySet();
		System.out.println(keySet);//[abc, demo, hello, java, job, selenium]
		
		Set entrySet = map.entrySet();
		System.out.println(entrySet);//[abc=456, demo=d, hello=456, java=456, job=null, selenium=d]
		
		Collection collection = map.values();
		System.out.println(collection);//[456, d, 456, 456, null, d]
	}

}
