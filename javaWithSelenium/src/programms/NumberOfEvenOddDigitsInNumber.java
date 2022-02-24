package programms;

public class NumberOfEvenOddDigitsInNumber {
public static void main(String[] args) {
	
	int num= 1234;
	int even_count=0;
	int odd_count=0;
	
	while(num>0)	//1234	123	12	1
	{
		int rem=num%10;//to get last digit of the number	//4	3	2	1
		
		if(rem%2==0)
		{
			even_count++;	//1	2
		}
		else
		{
			odd_count++;	//1	2
		}
		num=num/10;	//123	//12	//1
		
	}
	
	System.out.println("no of even numbers:   "+even_count);
	System.out.println("no of even numbers:   "+odd_count);
}
}
