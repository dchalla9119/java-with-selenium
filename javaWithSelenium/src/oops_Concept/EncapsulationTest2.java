package oops_Concept;

class EncapsulationDemo1
{
	public int practiceHrs = 9;
	public String name = "Dileep";
	public static String strictto = "practice";
	
	public void practice()
	{
		System.out.println("practice = job");
		System.out.println(strictto);
		System.out.println(practiceHrs + "  " + name );
	}
}
public class EncapsulationTest2 {
public static void main(String[] args) {
	EncapsulationDemo1 demo = new EncapsulationDemo1();
	demo.practiceHrs = 0;
	demo.name = "Dileep india pvt ltd";
	demo.practice();
}
}
//here we are getting main method data as output
//output
//practice = job
//practice
//0  Dileep india pvt ltd
