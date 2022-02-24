package basics;

class Addition_Program3
{
public int n1 = 10;
public int n2 = 20;
String name = "rameshsoft";
public int addition()
{
	int result = n1+n2;
	System.out.println("result is :  " + result);
	return result;
}//end of method
}//end of class
public class NonStaticObject {

public static void main(String[] args) {
	Addition_Program3 NewProg = new Addition_Program3();//we created object with new operator. one object is going to be created along with static copy.
	//syntax: classname  variablename = new  classname() 
	System.out.println("JRE started execution");
	int n1response = NewProg.n1;
	System.out.println("n1 response is : "  + n1response);
	int n2response = NewProg.n2;
	System.out.println("n2 response is : "  + n2response);
	int additionresponse = NewProg.addition();
	System.out.println("addition response is  :  "  + additionresponse);
	String nameResponse = NewProg.name;
	System.out.println("The name is   :   "  + nameResponse);
}//end of main method
}//end of class

////output:
//n1 response is : 10
//n2 response is : 20
//result is :  30
//addition response is  :  30
//The name is   :   rameshsoft
