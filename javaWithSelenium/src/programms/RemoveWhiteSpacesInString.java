package programms;

public class RemoveWhiteSpacesInString {
public static void main(String[] args) {
	
	String str= "java     programming  selenium  automation";
	
	System.out.println("before removing the white spaces: "+str);
	//str = str.replaceAll(" ", "");//we can write like this or below way
	str = str.replaceAll("\\s", "");
	System.out.println("after removing the white spaces: "+str);
	
}
}
