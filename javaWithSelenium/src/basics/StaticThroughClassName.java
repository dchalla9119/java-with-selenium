package basics;


class Addition_Program
{
static public int n1 = 10;
static public int n2 = 20;
String name = "rameshsoft";
static public int addition()
{
	int result = n1+n2;
	System.out.println("result is :  " + result);
	return result;
}//end of method
}//end of class
public class StaticThroughClassName {

public static void main(String[] args) {
	System.out.println("JRE started execution");
	int n1response = Addition_Program.n1;//dataType varName  =  className.static_var_name
	System.out.println("n1 response is : "  + n1response);
	int n2response = Addition_Program.n2;//dataType varName  =  className.static_var_name
	System.out.println("n2 response is : "  + n2response);
	int additionresponse = Addition_Program.addition();//dataType varName  =  className.static_method_name
	System.out.println("addition response is  :  "  + additionresponse);
}//end of main method
}//end of class

////output:
//JRE started execution
//n1 response is : 10
//n2 response is : 20
//result is :  30
//addition response is  :  30
