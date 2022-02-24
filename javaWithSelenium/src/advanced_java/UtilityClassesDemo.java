package advanced_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UtilityClassesDemo {

	public static void main(String[] args) {
		
//		{
//		List l = new ArrayList<>();
//		l.add(456);
//		l.add(91777);
//		l.add(1);
//		l.add(91456);
//		l.add(56);
//		System.out.println(l);//[456, 91777, 1, 91456, 56]
	////inpection order is preserved
	//	
//		Collections.sort(l);//collections is utility class.
//		System.out.println(l);//[1, 56, 456, 91456, 91777]
	////sorting nature in asscending order
//		}
		
		
		
//		String[] st = {"hello","jave","selenium","job"};
//		for(int i=0; i<st.length; i++)
//		{
//			System.out.println(1);
		//0
		//1
		//2
		//3
//		}
		
		
		
		String[] str = {"hello","hiii","java","selenium","job"};
		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
//			hello
//			hiii
//			java
//			selenium
//			job

		}
		Arrays.sort(str);
		System.out.println("**************************");//**************************

		for(int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);//we will get output in asscending order
//			hello
//			hiii
//			java
//			job
//			selenium

		}
	}

}
