package oops_Concept;

class EncapsulationDemo112
{
	private int practiceHrs = 9;
	private String name = "Dileep";
	private static String strictto = "practice";
	
	
	public int getPracticeHrs() {
		return practiceHrs;
	}
	public String getName() {
		return name;
	}
	public static String getStrictto() {
		return strictto;
	}
//	public void practice()
//	{
//		System.out.println("practice = job");
//		System.out.println(strictto);
//		System.out.println(practiceHrs + "  " + name );
//	}
}

public class TightlyEncapsulation2 {
	public static void main(String[] args) {
		EncapsulationDemo112 demo = new EncapsulationDemo112();
		System.out.println(demo.getPracticeHrs());
		System.out.println(demo.getName());
		System.out.println(demo.getStrictto());
		System.out.println("practice = job");
	}

}
//pojo class are supporter classes to tightly encapsulayion classes
