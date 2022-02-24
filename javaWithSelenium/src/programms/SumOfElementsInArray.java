package programms;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {5,2,7,9,6};
		int sum=0;
		
//		for(int i=0;i<=a.length-1;i++)//0	1	2	3	4
//		{
//			sum=sum+a[i];//5+2+7+9+6
//		}
//		System.out.println("sum of array elements:    "+sum);
		
		
		//using enhanced for loop or for each loop
		for(int value:a)//1 value=5; 2 value=2; 3 value=7; 4 value=9; 5 value=6
		{
			sum=sum+value;//5	7	14	23	29
		}
		System.out.println("sum of array elements:    "+sum);
		
	}
}
