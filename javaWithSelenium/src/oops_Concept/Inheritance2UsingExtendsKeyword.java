package oops_Concept;

class Fp_Men1
{
	public void login()
	{
		System.out.println("LOGIN()");
	}
	public void logout()
	{
		System.out.println("LOGOUT()");
	}
	public void clothes()
	{
		System.out.println("CLOTHES()");
	}
}
class Fp_WoMen1 extends Fp_Men1//Fp_WoMen = child class; Fp_Men = parent class
{
		public void gold()
	{
		System.out.println("GOLD()");
	}
}
class Fp_Kids1 extends Fp_WoMen1
{
	public void toys()
	{
		System.out.println("TOYS()");
	}
}
//we are use inheritance concept with extends keyword.
public class Inheritance2UsingExtendsKeyword {
	public static void main(String[] args) {
		//creating parent class object(men) & on that parent class reference we can access only parent class data
		Fp_Men1 men = new Fp_Men1();
		men.login();
		men.logout();
		men.clothes();
		//creating child class object(women) & on that reference we can access both parent & child class
		Fp_WoMen1 women = new Fp_WoMen1();
		women.login();
		women.logout();
		women.gold();
		Fp_Kids1 kids = new Fp_Kids1();
		kids.login();
		kids.logout();
		kids.toys();
	}

}
//op
//LOGIN()
//LOGOUT()
//CLOTHES()
//LOGIN()
//LOGOUT()
//GOLD()
//LOGIN()
//LOGOUT()
//TOYS()

