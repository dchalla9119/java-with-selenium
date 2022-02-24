package programms;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);//to accept input at runtime
	
	System.out.println("enter a number:");
	int num=sc.nextInt();//accept the value from the user and stores in num
	
	//1 using algorithm
//	
	int orginalNumber= num;
	int rev=0;
	while(num!=0)
	{
		rev=rev*10 +num%10;//0*10+1234%10 = 4     4*10+123%10=40+3=43    43*10+12%10=430+2=432  432*10+1%10=4321
		num = num/10;   //1234/10=123    			123/10=12   			 12/10=1 			 1/10=0
	}
	//System.out.println("reverse number is:    "+rev);

	if(orginalNumber==rev)
	{
		System.out.println(orginalNumber +"         Palindrome Number" );
	}
	else
	{
		System.out.println(orginalNumber +"         Not Palindrome Number" );
	}
}
}
