package oops_Concept;

class ConsDemoCD
{
//	public ConsDemoCD()
//	{
//		super();
//		System.out.println("p :default constructor");
//	}
	public ConsDemoCD()
	{
		this(9);
		System.out.println("p :default constructor");
	}
	public ConsDemoCD(int practiceHrs)
	{
		super();
		System.out.println("p :1 int constructor");
	}
}
public class constructor_this_super_constructorCalls extends ConsDemoCD
{
public constructor_this_super_constructorCalls()
{
	super();
	System.out.println("c :default constructor");
}
public static void main(String[] args) {
	constructor_this_super_constructorCalls constructor_this_super_ = new constructor_this_super_constructorCalls();
}
}
//1 outpt
			//p :default constructor
			//c :default constructor
		
// 2 output
			//p :1 int constructor
			//p :default constructor
			//c :default constructor
