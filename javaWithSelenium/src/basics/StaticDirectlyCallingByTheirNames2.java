package basics;


public class StaticDirectlyCallingByTheirNames2 {
	static public int n1 = 10;
	static public int n2 = 20;
	String name = "rameshsoft";
	static public int n3 = n1+n2;
	public static void main(String[] args) {
		System.out.println("JRE started execution");
		int n1response = n1;
		System.out.println("n1 response is : "  + n1response);
		int n2response = n2;
		System.out.println("n2 response is : "  + n2response);
		int additionresponse = n3;
		System.out.println("addition response is  :  "  + additionresponse);
	}//end of main method
	}//end of class

////output:
//JRE started execution
//n1 response is : 10
//n2 response is : 20
//addition response is  :  30
