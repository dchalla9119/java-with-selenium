package oops_Concept;

class overloadDemo1
{
	public int addition(int n1, int n2)
	{
		int r = n1+n2;
		System.out.println("int result id :  "+r);
		return r;
	}
	public float addition(float n1, float n2)
	{
		float r = n1+n2;
		System.out.println("float result id :  "+r);
		return r;
	}
	public double addition(double n1, double n2)
	{
		double r = n1+n2;
		System.out.println("double result id :  "+r);
		return r;
	}
}
public class OverLoading2 {
public static void main(String[] args) {
	overloadDemo1 demo = new overloadDemo1();
	demo.addition(2, 3);
	demo.addition(7, 3);
	demo.addition(2.5f, 3.5f);
	demo.addition(5.5f, 3.5f);
	demo.addition(2.5, 3.5);
	demo.addition(5.5, 3.5);
	demo.addition('a', 'b');
	demo.addition('a', 25);
	demo.addition(25, 45.25);
	//automatic promotion to next level. byte-short-int(char)-long-float-double. following this method.so we dont get errors
	//we dont get errors in method level and constructor level in overloading. this is called automatic promotions in java
}
}
//op
//int result id :  5
//int result id :  10
//float result id :  6.0
//float result id :  9.0
//double result id :  6.0
//double result id :  9.0
//int result id :  195
//int result id :  122
//double result id :  70.25
//
