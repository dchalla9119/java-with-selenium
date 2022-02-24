package oops_Concept;

class ConsTest2
{
	int practiceHrs;
	String result;
	//initialisatin of these two variables with constructor. parameterized constructor is suitable for initialisation
	public ConsTest2(int practiceHrs,String result)//datatype should be same variables names can be different. here we used same variable names
	{
		this.practiceHrs = practiceHrs;// output 9
		this.result = result;// output job
		//same variable Names. local variables and class level variables. by using this. keyword priority is given to class level variables
	}
	public ConsTest2()
	{
		System.out.println("default constructor");
	}
//	public ConsTest2(int practiceHrs,String result)//datatype should be same variables names can be different. here we used same variable names
//	{
//		practiceHrs = practiceHrs;// output 0
//		result = result;// output null
//		//same variable Names. local variables and class level variables. always gives priority for local level variables
//	}
//	public ConsTest2(int pracHrs,String res)//datatype should be same variables names can be different
//	{
//		practiceHrs = pracHrs;//we can use this. keyword also. //output 0
//		result = res;//we can use this. keyword also. //output  null
//	}
	public void print()
	{
		System.out.println(practiceHrs+"********"+result);
	}
}
public class ConstructorOverloading {
public static void main(String[] args) {
	ConsTest2 consTest2 = new ConsTest2(9,"JOB");
	consTest2.print();	//1output : 9********JOB // 2output : 0********null //3output  :  9********JOB
	ConsTest2 consTest3 = new ConsTest2('d',"JOB");
	consTest3.print();
}
}
//op
//9********JOB
//100********JOB

