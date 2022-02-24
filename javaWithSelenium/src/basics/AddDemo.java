package basics;

//public class AddDemo //class
//	
//{
//	public static void main(String[] args) //main method
//	{
//		System.out.println("JVM started execution");
//	}
//	
//	public int n1=25;//non static var
//	public int n2=25;
//	public int add()//method
//	{
//		int result = n1+n2;
//		System.out.println("result is:"  +result);
//		return result;
//	}
//}
//
//
////output
////JVM started execution


//public class AddDemo //class
//
//{
//	public static void main(String[] args) //main method
//	{
//			int num1=25;//non static var
//			int num2=25;
//			int result = num1+num2;
//			System.out.println("JVM started execution");
//			System.out.println("result is:"  +result);
//			
//	}
//	
//	
//}
//
//
////output
////JVM started execution
////result is:50



class Add1
{
	public int n1=25;//non static var
	public int n2=25;
	public int add()//method
	{
		int result = n1+n2;
		System.out.println("result is:"  +result);
		return result;
	}

}
public class AddDemo //class

{
public static void main(String[] args) //main method
{
	System.out.println("JVM started execution");
	Add1 prog = new Add1();
	prog.add();
}

}
////output
////JVM started execution
////result is:50

