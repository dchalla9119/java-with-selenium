package programms;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		
		String arr[]= {"java","c","c++","python","java"};
		
		
//		//1 logic
//		boolean flag=false;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("found duplicate element: "+arr[i]);
//					flag=true;
//				}
//			}
//		}
//		
//		if(flag==false)
//		{
//			System.out.println("duplicate element not found");
//		}
//		
		
		//2 logic using hashset
		HashSet hs=new HashSet<>();
//		System.out.println(hs.add("java"));
//		System.out.println(hs.add("python"));
//		System.out.println(hs.add("java"));
		//hashset do not allow duplicates
		boolean flag=false;
		for(String l:arr)
		{
			if(hs.add(l)==false)
			{
				System.out.println("found duplicate element:"+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("not found duplicates");
		}
		
	}
}
