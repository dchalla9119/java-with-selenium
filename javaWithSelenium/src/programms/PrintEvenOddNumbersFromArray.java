package programms;

public class PrintEvenOddNumbersFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
//	//using normal for loop
//		//extracting even numbers
//		System.out.println("even numbers in array...............");
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//			{
//				System.out.println(a[i]);
//			}
//		}
//		
//		//extracting odd numbers
//				System.out.println("odd numbers in array...............");
//				for(int i=0;i<a.length;i++)
//				{
//					if(a[i]%2!=0)
//					{
//						System.out.println(a[i]);
//					}
//				}
		
	//using enhanced for loop
		//extracting even numbers
		System.out.println("even numbers in array...............");
		for(int v:a)
		{
			if(v%2==0)
				System.out.println(v);
		}
		//extracting odd numbers
		System.out.println("odd numbers in array...............");
		for(int v:a)
		{
			if(v%2!=0)
				System.out.println(v);
		}
		
	}
}
