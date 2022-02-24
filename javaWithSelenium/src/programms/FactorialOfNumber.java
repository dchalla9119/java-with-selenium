package programms;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int num=5;
		
		long factorial = 1;
		
//		for(int i=1;i<=num;i++)//1	2	3	4	5
//		{
//			factorial = factorial*i;//1	2	6	24	120
//		}
//		System.out.println("factorial of number is:   "+factorial);
//		
		
		for(int i=num;i>=1;i--)//5	4	3	2	1
		{
			factorial = factorial*i;//5	20	60	120	120
		}
		System.out.println("factorial of number is:   "+factorial);
	}
}
