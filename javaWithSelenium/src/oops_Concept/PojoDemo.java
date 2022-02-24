package oops_Concept;

class PojoTest
{
	private int practiceHrs = 9;
	private String name = "Dileep";

	public int getPracticeHrs()
	{
		return practiceHrs;//getter methods. to access private variables outside the class. 
	}
	public String getName()
	{
		return name;
	}
}
public class PojoDemo {
public static void main(String[] args) {
	PojoTest pojo = new PojoTest();
	System.out.println(pojo.getPracticeHrs());
	System.out.println(pojo.getName());
}
}
