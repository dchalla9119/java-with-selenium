package programms;

public class ReverseEachWordInString {
public static void main(String[] args) {
	
	
//	//1 logic
//	String str="welcome to java and selenium";//original string
//	String[] words=str.split(" ");//spliting string into words
//	
//	String reverseString="";
//	for(String w : words)
//	{
//		String reverseWord="";
//		for(int i=w.length()-1;i>=0;i--)  //welcome  to java
//		{
//			reverseWord=reverseWord+w.charAt(i);
//		}
//		
//		reverseString=reverseString+reverseWord+" ";//emoclew  ot  avaj
//	}
//	
//	System.out.println(reverseString);
	
	
	
	//2 logic
	String str="welcome to java";
	String[] words=str.split("\\s");
	
	String reverseWord="";
	
	for(String w:words)
	{
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		reverseWord=reverseWord+sb.toString()+" ";
	}
	System.out.println(reverseWord);
}
}
