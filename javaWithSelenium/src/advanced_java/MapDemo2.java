package advanced_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map map = new HashMap<>();
		map.put(456, 56);
		map.put(59, 456);
		map.put(24, 789);
		map.put(45, 456789);
		
		Set setKeys = map.keySet();
		
		for(Object key : setKeys)
		{
			Object value = map.get(key);
			System.out.println(key+" = "+value);
		}
		
	}

}
