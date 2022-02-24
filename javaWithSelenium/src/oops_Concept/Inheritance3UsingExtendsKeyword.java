package oops_Concept;

class Fp_Men2
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
class Fp_WoMen2 extends Fp_Men2//Fp_WoMen = child class; Fp_Men = parent class
{
		public void gold()
	{
		System.out.println("GOLD()");
	}
}
class Fp_Kids2 extends Fp_WoMen2
{
	public void toys()
	{
		System.out.println("TOYS()");
	}
}
//we are use inheritance concept with extends keyword.
public class Inheritance3UsingExtendsKeyword {
	public static void main(String[] args) {
		//creating parent class object(Fp_Men2()) & on that parent class reference we can access only parent class data(Fp_Men2)
		Fp_Men2 men = new Fp_Men2();
		men.login();
		men.logout();
		men.clothes();
		//creating child class object(Fp_WoMen2()) & on that reference we can access both parent(Fp_Men2) & child class(Fp_WoMen2)
		Fp_WoMen2 women = new Fp_WoMen2();
		women.login();
		women.logout();
		women.gold();
		women.clothes();
		//creating child class object & on that reference we can access both parent & child class
		Fp_Kids2 kids = new Fp_Kids2();
		kids.login();
		kids.logout();
		kids.toys();
		kids.clothes();
		kids.gold();
		//by using parent class reference(Fp_Men2) we can create child class object(Fp_WoMen2()). in this parent class reference we can access only parent class methods
		//we cannot access child class methods
		Fp_Men2 men1 = new Fp_WoMen2();//Fp_Men2=parent class reference	;	Fp_WoMen2()=child class object
		men1.login();
		men1.clothes();
		men1.logout();
		//men1.toys();we cannot acceess child class object
		//Fp_WoMen2 women1 = new Fp_Men2();
		//by using child class reference we cannot create parent class object.
	}
}
////op
//LOGIN()
//LOGOUT()
//CLOTHES()
//LOGIN()
//LOGOUT()
//GOLD()
//CLOTHES()
//LOGIN()
//LOGOUT()
//TOYS()
//CLOTHES()
//GOLD()
//LOGIN()
//CLOTHES()
//LOGOUT()

