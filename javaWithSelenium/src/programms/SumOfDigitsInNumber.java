package programms;

public class SumOfDigitsInNumber {
public static void main(String[] args) {
	
	int num= 1234;
	int sum=0;
		
	while(num>0)	//1234	123	12	1
	{
		sum=sum+num%10;//to get last digit of the number and add the digit	//4+3+2+1
		
		num=num/10;	//123	//12	//1
		
	}
	
	System.out.println("sum of digits is:   "+sum);
	
	
}
}
