package oops_Concept;

abstract class Test2
{
	abstract public void m1();
	abstract public void m2();
	public void m3()
	{
		System.out.println("m3");
	}
	public void m4()
	{
		System.out.println("m4");
	}
}
class Test3 extends Test2
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
}
public class AbstractDemo3 {
public static void main(String[] args) {
	Test3 test = new Test3();
	test.m1();
	test.m2();
	test.m3();
	test.m4();
}
}
