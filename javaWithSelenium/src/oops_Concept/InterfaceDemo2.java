package oops_Concept;

interface BankATM1//by default every interface becomes abstract. if you declare or dont declare abstract there is no problem.
//we cannot create object for the interface
{
	//private String id = "str"; we cannot take private. by default every variable becomes public static final
	String bankName = "rameshsoft";
	void cashDeposit();//public and abstract by default
	void balanceEnq();//public and abstract by default
	void miniStmt();//public and abstract by default
	void cashWithDraw();//public and abstract by default
//	public static void accountCreation()//static method
//	{
//		System.out.println("ACCOUNT CREATION");
//	}
//	default double bankBal()//default method
//	{
//		System.out.println("BANK BALANCE");
//		return 45000000.3666;
//	}
}
//class BankATMImpl1 implements BankATM1//this is also correct. we can do it in another way
//{
//
//	public void cashDeposit() {
//		System.out.println("CASH DEPOSIT");
//	}
//
//	public void balanceEnq() {
//		System.out.println("BALANCE ENQUIRY");
//	}
//
//	public void miniStmt() {
//		System.out.println("MINI STATEMENT");
//	}
//
//	public void cashWithDraw() {
//		System.out.println("CASH WITHDRAWL");
//	}
//	public void customerName() {
//		System.out.println("CUSTOMER NAME");
//	}
//}
abstract class BankATMImpl1 implements BankATM1//this is also correct. we can do it in another way
//we cannot create object for this abstract class
{
	
	public void balanceEnq() {
		System.out.println("BALANCE ENQUIRY");
	}

	public void miniStmt() {
		System.out.println("MINI STATEMENT");
	}

	public void cashWithDraw() {
		System.out.println("CASH WITHDRAWL");
	}
	public void customerName() {
		System.out.println("CUSTOMER NAME");
	}
}
class BankATMImplOne1 extends BankATMImpl1//we can create object for this fully implemented class
{
	public void cashDeposit() {
		System.out.println("CASH DEPOSIT");
	}
	public void customerDetails() {
		System.out.println("CUSTOMER DETAILS");

	}
}
public class InterfaceDemo2 {
public static void main(String[] args) {
	
	//BankATM bankATM = new BankATM();    compile time error. we cannot create object.
	//BankATMImpl bankATMimp1 = new BankATMImpl();    compile time error. we cannot create object.
//below method we can print the output. this method is also correct. by using abstract method also we can get the output.
//	{
//	BankATMImplOne1 bankATMImplOne1 = new BankATMImplOne1();
//	bankATMImplOne1.balanceEnq();
//	bankATMImplOne1.cashDeposit();
//	bankATMImplOne1.cashWithDraw();
//	bankATMImplOne1.customerDetails();
//	bankATMImplOne1.customerName();
//	bankATMImplOne1.miniStmt();
//	System.out.println(bankATMImplOne1.bankName);
//	System.out.println(BankATM1.bankName);
//	}
//by using abstract method
	BankATMImpl1 bankATMImp11 = new BankATMImplOne1();
	bankATMImp11.balanceEnq();
	bankATMImp11.cashDeposit();
	bankATMImp11.cashWithDraw();
	bankATMImp11.customerName();
	bankATMImp11.miniStmt();
	//bankATMImp1.customerDetails();  we can access only parent class
//by using interface reference
	BankATM1 bankATM1 = new BankATMImplOne1();
	bankATM1.balanceEnq();
	bankATM1.cashDeposit();
	bankATMImp11.cashWithDraw();
	//bankATM.customerName();   inside interface this details are not there. so we will get error here
	bankATM1.miniStmt();
	//bankATM.customerDetails();     inside interface this details are not there. so we will get error here
	//BankATM1.accountCreation(); //static method
	//bankATM1.bankBal();//default method
	}
}

//op
//BALANCE ENQUIRY
//CASH DEPOSIT
//CASH WITHDRAWL
//CUSTOMER NAME
//MINI STATEMENT
//BALANCE ENQUIRY
//CASH DEPOSIT
//CASH WITHDRAWL
//MINI STATEMENT
//
