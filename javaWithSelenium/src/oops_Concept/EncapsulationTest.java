package oops_Concept;

class EncapsulationDemo
{
	public int practiceHrs = 9;
	public String name = "Dileep";
	public static String strictto = "practice";
	
	public void practice()
	{
		System.out.println("practice = job");
		System.out.println(strictto);
		System.out.println("strictto");
		System.out.println(practiceHrs + "  " + name );
		System.out.println("practiceHrs" + "  " + name );
	}
}
public class EncapsulationTest {
public static void main(String[] args) {
	EncapsulationDemo demo = new EncapsulationDemo();
	//demo.practiceHrs = 0;
	//demo.name = "Dileep india pvt ltd";
	demo.practice();
}
}
//output: 
//practice = job
//practice
//strictto
//9  Dileep
//practiceHrs  Dileep
