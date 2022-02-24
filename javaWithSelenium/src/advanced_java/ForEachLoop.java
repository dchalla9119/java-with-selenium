package advanced_java;

import java.util.HashSet;

public class ForEachLoop {

	public static void main(String[] args) {
		
		//ArrayList al = new ArrayList<>();
		HashSet al = new HashSet<>();
			
			al.add(456);
			al.add(1456);
			al.add(789);
			al.add(91456);
			al.add(1456);
			al.add(456);
			
			for(Object obj :al)//from this arraylist al we will get elements automatically. we no need to write increamenet or decreament
			{
				Integer i = (Integer) obj;
				if(i==456)
				{
					System.out.println("hello");
				}
				System.out.println(i);
			}
		
		String[] str = { "hello","java","selenium","job"};
		for(String st :str)
		{
			System.out.println(st);
		}
		
	}

}
