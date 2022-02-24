package oops_Concept;

import oops_Concept.Outer.Inner1;

class Outer//in outer class we can take static and non static
{
	public void demo1()
	{
		System.out.println("O: demo1");
	}
	static public void demo2()
	{
		System.out.println("O: demo2");
	}
	static class Inner//in static inner class we can take static non static methods
	{
		public void demo1()
		{
			System.out.println("I: demo1");
		}
		static public void demo2()
		{
			System.out.println("I: demo2");
		}
	}
	class Inner1
	{
		public void demo1()
		{
			System.out.println("NSI: demo1");//NSI: non static inner
		}
//		static public void demo2()//inside non static inner class static methods are not allowed
//		{
//			System.out.println("NSI: demo2");
//		}
	}
}
public class InnerClassesTest {
public static void main(String[] args) {
	
//	Outer outer = new Outer();//by creating object we can access non static outer class
//	outer.demo1();
//	outer.demo2();
//	Outer.demo2();//by class name also we can access 
//	Outer.Inner.demo2();
//	Outer.Inner inner = new Outer.Inner();
//	inner.demo1();
//	inner.demo2();
	Outer outer = new Outer();
	//inner class is non static. we will create object for outer class. by using that object we create inner class object.. we call by thar name
	
	Inner1 inner = outer.new Inner1();
	inner.demo1();
}
}
