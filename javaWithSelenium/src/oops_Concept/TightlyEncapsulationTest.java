package oops_Concept;

class EncapsulationDemo11
{
	private int practiceHrs = 9;
	private String name = "Dileep";
	private static String strictto = "practice";
	
	public void practice()
	{
		System.out.println("practice = job");
		System.out.println(strictto);
		System.out.println(practiceHrs + "  " + name );
	}
}

public class TightlyEncapsulationTest {
	public static void main(String[] args) {
		EncapsulationDemo11 demo = new EncapsulationDemo11();
	demo.practiceHrs = 0;//this is tightly encapsulation.we cannot access private variables. scope is within the class. 
	//this can be executed by using getter and setter methods. contains bussiness implementations.
	demo.name = "Dileep india pvt ltd";//to execute this type of programs we also use pojo class and by using getter and setter methods. 
	//pojo doesnt contains any bussiness implemantations.
	demo.practice();
	}

}
//pojo class are supporter classes to tightly encapsulayion classes