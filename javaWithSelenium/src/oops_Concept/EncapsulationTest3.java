package oops_Concept;

class TightlyEncapsulation
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
public class EncapsulationTest3 {
public static void main(String[] args) {
	TightlyEncapsulation demo = new TightlyEncapsulation();
	demo.practiceHrs = 0;
	demo.name = "Dileep india pvt ltd";
	demo.practice();
}
}

//we cannot access outside the class. this is tightly encapsulation

//class TightlyEncapsulation
//{
//	private int practiceHrs = 9;
//	private String name = "Dileep";
//	private static String strictto = "practice";
//	
//	public void practice()
//	{
//		System.out.println("practice = job");
//		System.out.println(strictto);
//		System.out.println(practiceHrs + "  " + name );
//	}
//}
//public class EncapsulationTest3 {
//public static void main(String[] args) {
//	TightlyEncapsulation demo = new TightlyEncapsulation();
//	demo.practiceHrs = 0;
//	demo.name = "Dileep india pvt ltd";
//	demo.practice();
//}
//}
//
////we cannot access outside the class. this is tightly encapsulation