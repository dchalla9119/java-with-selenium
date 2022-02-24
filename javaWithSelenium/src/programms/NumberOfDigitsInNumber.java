package programms;

public class NumberOfDigitsInNumber {
public static void main(String[] args) {
	
	int num=123456;
	int count=0;
	
	while(num>0)
	{
		num=num/10;	//123456/10=12345	12345/10=1234	1234/10=123	123/10=12	12/10=1		1/10=0
		count++;	//1					2				3			4			5			6
	}
	
	System.out.println("No of digits in a number   "+count);
	
}
}
