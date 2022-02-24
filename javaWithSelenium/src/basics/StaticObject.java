package basics;


class Addition_Program1
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
public class StaticObject {

public static void main(String[] args) {
	Addition_Program1 NewProg = new Addition_Program1();//we created object with new operator. one object is going to be created along with static copy.
	//syntax: classname variablename = new classname() 
	System.out.println("JRE started execution");
	int n1response = NewProg.n1;//dataType var = ot/rt_varname.static_var_name
	System.out.println("n1 response is : "  + n1response);
	int n2response = NewProg.n2;//dataType var = ot/rt_varname.static_var_name
	System.out.println("n2 response is : "  + n2response);
	int additionresponse = NewProg.addition();//dataType var = ot/rt_varname.static_method_name
	System.out.println("addition response is  :  "  + additionresponse);
}//end of main method
}//end of class

////output:
//JRE started execution
//n1 response is : 10
//n2 response is : 20
//result is :  30
//addition response is  :  30
