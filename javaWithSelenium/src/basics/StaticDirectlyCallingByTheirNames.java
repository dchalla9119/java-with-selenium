package basics;


public class StaticDirectlyCallingByTheirNames //class
{
	static public int n1 = 10;//variable
	static public int n2 = 20;
	String name = "rameshsoft";
	static public int addition()//method
	{
		int result = n1+n2;
		System.out.println("result is :  " + result);
		return result;
	}
	public static void main(String[] args) //main method
	{
		System.out.println("JRE started execution");
		int n1response = n1;//dataType  VarName  =  static_var_name
		System.out.println("n1 response is : "  + n1response);
		int n2response = n2;//dataType  VarName  =  static_var_name
		System.out.println("n2 response is : "  + n2response);
		int additionresponse = addition();//dataType  varName  =  static_method_name
		System.out.println("addition response is  :  "  + additionresponse);
	}//end of main method
	}//end of class

////output:
//JRE started execution
//n1 response is : 10
//n2 response is : 20
//result is :  30
//addition response is  :  30
