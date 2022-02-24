package oops_Concept;

interface BankATM//by default every interface becomes abstract. if you declare or dont declare abstract there is no problem.
//we cannot create object for the interface
{
	//private String id = "str"; we cannot take private. by default every variable becomes public static final
	String bankName = "rameshsoft";
	void cashDeposit();//public and abstract by default
	void balanceEnq();//public and abstract by default
	void miniStmt();//public and abstract by default
	void cashWithDraw();//public and abstract by default
}
//class BankATMImpl implements BankATM//this is also correct. we can do it in another way
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
abstract class BankATMImpl implements BankATM//this is also correct. we can do it in this way
//we cannot create object for this abstract class.  //interface concept
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
class BankATMImplOne extends BankATMImpl//we can create object for this fully implemented class  //extends inheritence
{
	public void cashDeposit() {
		System.out.println("CASH DEPOSIT");
	}
	public void customerDetails() {
		System.out.println("CUSTOMER DETAILS");
	}
}
public class InterfaceDemo {
public static void main(String[] args) {
	
	//BankATM bankATM = new BankATM();    compile time error. we cannot create object.
	//BankATMImpl bankATMimp1 = new BankATMImpl();    compile time error. we cannot create object.
//below method we can print the output. this method is also correct. by using abstract method also we can get the output.
//	{
//	BankATMImplOne bankATMImplOne = new BankATMImplOne();
//	bankATMImplOne.balanceEnq();
//	bankATMImplOne.cashDeposit();
//	bankATMImplOne.cashWithDraw();
//	bankATMImplOne.customerDetails();
//	bankATMImplOne.customerName();
//	bankATMImplOne.miniStmt();
//	System.out.println(bankATMImplOne.bankName);
//	System.out.println(BankATM.bankName);
//	}
//by using abstract method
	BankATMImpl bankATMImp1 = new BankATMImplOne();
	bankATMImp1.balanceEnq();
	bankATMImp1.cashDeposit();
	bankATMImp1.cashWithDraw();
	bankATMImp1.customerName();
	bankATMImp1.miniStmt();
	//bankATMImp1.customerDetails();  we can access only parent class
//by using interface reference
	BankATM bankATM = new BankATMImplOne();
	bankATM.balanceEnq();
	bankATM.cashDeposit();
	bankATMImp1.cashWithDraw();
	//bankATM.customerName();   inside interface this details are not there. so we will get error here
	bankATM.miniStmt();
	//bankATM.customerDetails();     inside interface this details are not there. so we will get error here
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
