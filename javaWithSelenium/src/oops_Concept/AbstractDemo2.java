package oops_Concept;

abstract class AbstractOne//we cannot create object for AbstractOne class
{
	public void hello()
	{
		System.out.println("please do practice");
	}
	abstract public void job();//we dont know implementations. we have a service requirement so we declare this method as abstract
	abstract public void salary();//we dont know implementations. we have a service requirement so we declare this method as abstract
}
//class AbstractTwo extends AbstractOne
//{
//
//	@Override
//	public void job() {
//		System.out.println("job");
//	}
//
//	@Override
//	public void salary() {
//
//		System.out.println("salary");
//	}
//	public void practice()//we can have other methods also in this child class along with abstract methods.
//	{
//		System.out.println("practice");
//	}
//}
//above class is also correct.
abstract class AbstractTwo extends AbstractOne//we cannot cteate object for AbstractTwo
{

	@Override
	public void job() {
		System.out.println("job");
	}

		public void practice()//we can have other methods also in this child class along with abstract methods.
	{
		System.out.println("practice");
	}
}
class AbstractThree extends AbstractTwo//we can create object for AbstractThree class. this is fully implemented class/concrete class/service provider class
//we can create object for fully implemented class.
//we have two abstract methods. we are executing only one in AbstractTwo class.one more child class is responsible to execute another abstract method.
//so we are creating AbstractThree
{
	@Override
	public void salary() {

		System.out.println("salary");
	}
	public void hike()
	{
		System.out.println("hike");
	}
}

public class AbstractDemo2 {
public static void main(String[] args) {
	//AbstractOne one = new AbstractOne();	compile time error
	//AbstractTwo two = new AbstractTwo(); compile time erroe
	AbstractThree three = new AbstractThree();//we can create object because it is fully implemented class
	//how to create object using new operator
	//classname    varname   =   new   classname();
	//classname: abstract/non abstract        classname(): non abstract
	three.hello();
	three.hike();
	three.job();
	three.practice();
	three.salary();
	
	AbstractOne one = new AbstractThree();//child class object using parent class reference
	one.hello();
	one.job();
	one.salary();
	//one.practice();	
			//abstract public class AbstractDemo2 {
		//public static void main(String[] args) {
		//AbstractDemo2 demo = new AbstractDemo2(); //we cannot create object for abstract class otherwise we will get error
	}
}
	//for non abstract class we can create object
	//standard syntax for abstract method : abstract <as> void /returntype  methodname(---);
	//abstract method doesnt contains any implementations, it only contains declarations.
	//whenever your class is having atleast or minimum 1 abstract method compulsory must and should declare the class as abstract



//op
//please do practice
//hike
//job
//practice
//salary
//please do practice
//job
//salary
//
//
