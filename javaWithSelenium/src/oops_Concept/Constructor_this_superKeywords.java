package oops_Concept;

class ConsTest3
{
	int practiceHrs = 456;
	 public void demo()
	{
		System.out.println("demo:" +this.practiceHrs);
	}
}
class ConsTest22 extends ConsTest3
{
	int practiceHrs;
	String result;
	//initialisatin of these two variables with constructor. parameterized constructor is suitable for initialisation
	public ConsTest22(int practiceHrs,String result)//datatype should be same variables names can be different. here we used same variable names
	{
		this.practiceHrs = practiceHrs;
		this.result = result;	
		System.out.println(practiceHrs);
		System.out.println(this.practiceHrs);//current class level: ConsTest2
		System.out.println(super.practiceHrs);//parent class : ConsTest3
		super.demo();
		
		}
	public ConsTest22()
	{
		System.out.println("default constructor");
	}
	public void print()
	{
		System.out.println(practiceHrs+"********"+result);
	}
}
public class Constructor_this_superKeywords {
public static void main(String[] args) {
	ConsTest22 consTest2 = new ConsTest22(9,"JOB");
	consTest2.print();	
	ConsTest22 consTest3 = new ConsTest22('d',"JOB");
	consTest3.print();
}
}
//op
//9
//9
//456
//demo:456
//9********JOB
//100
//100
//456
//demo:456
//100********JOB
//
