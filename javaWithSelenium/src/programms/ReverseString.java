package programms;

public class ReverseString {
public static void main(String[] args) {
	
	String str = "ABCD";
	String rev = "";
	
	
//	//1 using String concatenation operator
//	
//	int length=str.length();//it will give length of string  4
//	
//	for(int i=length-1;i>=0;i--)//3		2		1		0
//	{
//		rev=rev+str.charAt(i);  //D		C		B		A
//	}
//	System.out.println("reverse of string is:  "+rev);
//	
	
	
//	//2 by using character array
//	
//	char a[]=str.toCharArray();
//	int len = a.length;//4
//	
//	for(int i=len-1;i>=0;i--)  //3			2		1		0
//	{
//		rev = rev+a[i];			//D			C		B		A
//	}
//	System.out.println("reverse string is:"+rev);
//	
	
	
	//3 using stringbuffer class
	StringBuffer sb = new StringBuffer(str);
	sb.reverse();
	System.out.println("reverse of string is:  "+sb);
	
	
	
}
}
