package oops_Concept;

class PojoTest1
{
	private int practiceHrs = 9;
	private String name = "Dileep";

	//this is getter method to access practice variables outside the class.
	public int getPracticeHrs()//here we can give getHello or getDemo no problem
	{
		return practiceHrs; 
	}
	//this is getter method to access name variables outside the class.

	public String getName()
	{
		return name;
	}
}
//we can access anywhere
public class GetterMethods {
	public static void main(String[] args) {
		PojoTest1 pojo = new PojoTest1();
		System.out.println(pojo.getPracticeHrs());
		System.out.println(pojo.getName());
	}

}
