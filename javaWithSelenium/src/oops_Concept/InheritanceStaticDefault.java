package oops_Concept;

interface BankATM2	
{
String bankName = "rameshsoft";
	void cashDeposit();//public and abstract by default
	void balanceEnq();//public and abstract by default
	void miniStmt();//public and abstract by default
	void cashWithDraw();//public and abstract by default
	public static void accountCreation()//static method
	{
		System.out.println("ACCOUNT CREATION");
	}
	default double bankBa2()//default method
	{
		System.out.println("BANK BALANCE");
		return 45000000.3666;
	}
}
abstract class BankATMImpl2 implements BankATM2{
	public double bankBal()
	{
		System.out.println("CHILD BANK BALANCE");
		return 654565256.02122;
	}
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
class BankATMImplOne2 extends BankATMImpl2//we can create object for this fully implemented class
{
	public void cashDeposit() {
		System.out.println("CASH DEPOSIT");
	}
	public void customerDetails() {
		System.out.println("CUSTOMER DETAILS");
	}
}
public class InheritanceStaticDefault {
public static void main(String[] args) {
	BankATMImpl2 bankATMImp12 = new BankATMImplOne2();
	bankATMImp12.balanceEnq();
	bankATMImp12.cashDeposit();
	bankATMImp12.cashWithDraw();
	bankATMImp12.customerName();
	bankATMImp12.miniStmt();
	//bankATMImp12.accountCreation(); //not available to child
	BankATM2 bankATM2 = new BankATMImplOne2();
	bankATM2.balanceEnq();
	bankATM2.cashDeposit();
	bankATMImp12.cashWithDraw();
	bankATM2.miniStmt();
	BankATM2.accountCreation(); //static method
	bankATM2.bankBa2();//default method
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
//ACCOUNT CREATION
//BANK BALANCE
//
