package programms;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);//to accept input at runtime
	
	System.out.println("enter string");
	String str=sc.next();//accept the value from the user and stores in str
	
	String OrginalStr=str;
	String rev = "";
	
	
//	//1 using String concatenation operator
//	
	int length=str.length();//it will give length of string  4
//	
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);  
	}
	//System.out.println("reverse of string is:  "+rev);
	
	if(OrginalStr==rev)
	{
		System.out.println(OrginalStr+"       string is pallindrome");
	}
	else
	{
		System.out.println(OrginalStr+"       string is not pallindrome");
	}
}
}
