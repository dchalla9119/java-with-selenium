package advanced_java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class ExamDemo1 {

	public static void main(String[] args) {
		
		int[] i1 = {456,24,1,5,656,56};
		//arrange this in assending order
		TreeSet ts = new TreeSet();
		for(int i=0; i<i1.length; i++)
		{
			ts.add(i1[i]);
		}
		//in treeset we dont have any get mechanism so we create list object
		List list = new ArrayList<>(ts);
		Object minValue = list.get(0);//0 index always we have minimum value
		Object maxValue = list.get(list.size()-1);
		System.out.println(ts);//[1, 5, 24, 56, 456, 656]

		System.out.println(minValue+"**************************"+maxValue);//1**************************656

		
		
		
	}

}
