package programms;

import java.util.Scanner;

public class LargestOf3Numbers {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number:  ");
	int a=sc.nextInt();
	System.out.println("enter 2nd number:  ");
	int b=sc.nextInt();
	System.out.println("enter 3rd number:  ");
	int c=sc.nextInt();
	
//	//1 logic
//	if(a>b && a>c)
//	{
//		System.out.println(a+"   is the largest number");
//	}
//	else if(b>a && b>c)
//	{
//		System.out.println(b+"   is the largest number");
//	}
//	else
//	{
//		System.out.println(c+"   is the largest number");
//	}
	
	
	//2 logic by using Ternary operator
	//int largest1 = a>b?a:b;//largest of a and b
	//int largest2=c>largest1?c:largest1;//comparing largest with c and finding largest
	
	//we can write in single line
	int largest2=c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println(largest2+"    is largest number");
	
}
}
