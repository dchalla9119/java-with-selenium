package programms;

public class CountOccuranceOfCharacterInString {
public static void main(String[] args) {
	
	String s="java programming java oops";
	int totalCount=s.length();//total length
	int totalCount_afterRemove=s.replace("a", "").length();//total length after removing a's
	int count=totalCount-totalCount_afterRemove;
	System.out.println("number of occurances of a:  "+count);
}
}
