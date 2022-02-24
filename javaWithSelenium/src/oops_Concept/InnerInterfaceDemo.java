package oops_Concept;

interface Loan//outer interface. by default every outer interface becomes of type abstract
{
	void price();
	void intrest();
	interface HouseLoan//inner interface. by default every inner interface becomes of type public static abstract.
	{
		void houseLoanIntrest();
		void payment();
		void intrest();//we can have same method in inner and outer interface
	}
}
class LoanImpl implements Loan//outer interface implementations
{

	@Override
	public void price() {
		System.out.println("PRICE");
	}

	@Override
	public void intrest() {
		System.out.println("INTREST");
	}
	
}
class LoanHouseLoanImpl implements Loan.HouseLoan//inner interface implementations
{

	@Override
	public void houseLoanIntrest() {
		System.out.println("HOUSELOANINTREST");
	}

	@Override
	public void payment() {
		System.out.println("PAYMENT");
	}

	@Override
	public void intrest() {
		System.out.println("INTREST");//we can have same method in inner and outer interface. we have to implement here method
	}
	
}
class LoanHouseLoan implements Loan,Loan.HouseLoan//we can implement oter and inner interface in one class. class can implement multiple interfaces
{
	@Override
	public void price() {
		System.out.println("PRICE");
	}

	@Override
	public void intrest() {
		System.out.println("INTREST");
	}
	@Override
	public void houseLoanIntrest() {
		System.out.println("HOUSELOANINTREST");
	}

	@Override
	public void payment() {
		System.out.println("PAYMENT");
	}
//	@Override
//	public void intrest() {
//		System.out.println("INTREST");//we can have same method in inner and outer interface. one common method implementation is enough
//	}
}
public class InnerInterfaceDemo {
public static void main(String[] args) {
	
}
}
