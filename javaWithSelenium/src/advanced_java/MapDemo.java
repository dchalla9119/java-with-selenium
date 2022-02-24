package advanced_java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class MapDemo {

	public static void main(String[] args) {
//		{
//		//Map map = new HashMap<>();//we can denote in below way also
//		HashMap map = new HashMap();
//		map.put("hello","job is important");
//		map.put(456, 456.456);
//		map.put('d', 91456);
//		map.put(91456, 91456);
//		map.put(null, null);
//		//map.put(456, 9177791456l);//with this we will get output as {null=null, 91456=91456, d=91456, 456=9177791456, hello=job is important}  //inseption order is not preserved
//		//values can be duplicated keys cannot be duplicated.if we duplicate keys old values are replaced by new values
	//	
//		System.out.println(map);//output= {null=null, 91456=91456, d=91456, 456=456.456, hello=job is important}
//		//inseption order is not preserved
//		}
		
		
//		Map map = new Map<>() {
//		
//		};
//		
		
		
		
//		{
//		//Map map = new HashMap<>();//we can denote in below way also
//		//HashMap map = new HashMap();
//		LinkedHashMap map = new LinkedHashMap<>();
//		map.put("hello","job is important");
//		//      1st is called key, 2nd is called value  //1 entry = 1 key+1 value
//		map.put(456, 456.456);
//		map.put('d', 91456);
//		map.put(91456, 91456);
//		map.put(null, null);
//		map.put(456, 9177791456l);//with this we will get output as {hello=job is important, 456=9177791456, d=91456, 91456=91456, null=null} //inseption order is preserved
//		//values can be duplicated keys cannot be duplicated.if we duplicate keys old values are replaced by new values
	//	
//		System.out.println(map);//output= {hello=job is important, 456=456.456, d=91456, 91456=91456, null=null}
//		//inseption order is preserved
	//	
//		Object obj = map.get(91456);
//		System.out.println(obj);//91456
	//	
//		Object obj1 = map.getOrDefault('d', "demo");
//		System.out.println(obj1);//91456
	//	
//		Object obj2 = map.get(914561);
//		System.out.println(obj2);//null //there is no key 914561 so we will get null value
	//	
//		Object obj3 = map.getOrDefault('k', "demo");
//		System.out.println(obj3);//demo  //there is no key k so we will get programmer specified value demo
	//
//		}

		
		
		
		
		
//		{
//		ConcurrentHashMap map = new ConcurrentHashMap<>();
//		map.put("hello","job is important");
//		map.put(456, 456.456);
//		map.put('d', 91456);
//		map.put(91456, 91456);
//		//map.put(null, null);//null is not allowed in ConcurrentHashMap. we will get exception
//		map.put(456, 9177791456l);
//		//map.put(null, "demo");//null is not allowed for key also
//		//map.put("java", null);//null is not allowed for value also
	//	
//		System.out.println(map);//{91456=91456, d=91456, 456=9177791456, hello=job is important}
//		//inseption order is not preserved
//		}

		
		
		
		
		Hashtable hashtable = new Hashtable<>();
		hashtable.put("hello","job is important");
		hashtable.put(456, 456.456);
		hashtable.put('d', 91456);
		hashtable.put(91456, 91456);
		//hashtable.put(null, null);//null is not allowed in hashtable. we will get exception
		hashtable.put(456, 9177791456l);
		//hashtable.put(null, "demo");//null is not allowed for key also
		//hashtable.put("java", null);//null is not allowed for value also
		
		System.out.println(hashtable);//{hello=job is important, 456=9177791456, 91456=91456, d=91456}
		//inseption order is not preserved

		
		
	}

}
