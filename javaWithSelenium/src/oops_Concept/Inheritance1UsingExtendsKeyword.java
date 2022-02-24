package oops_Concept;

class Fp_Men
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
class Fp_WoMen
{
	public void login()
	{
		System.out.println("LOGIN()");
	}
	public void logout()
	{
		System.out.println("LOGOUT()");
	}
	public void gold()
	{
		System.out.println("GOLD()");
	}
}
class Fp_Kids
{
	public void login()
	{
		System.out.println("LOGIN()");
	}
	public void logout()
	{
		System.out.println("LOGOUT()");
	}
	public void toys()
	{
		System.out.println("TOYS()");
	}
}
//we are writing duplicate code. to overcome this we use inheritance concept with extends keyword.
public class Inheritance1UsingExtendsKeyword {
public static void main(String[] args) {
	Fp_Men men = new Fp_Men();
	men.login();
	men.logout();
	men.clothes();
	Fp_WoMen women = new Fp_WoMen();
	women.login();
	women.logout();
	women.gold();
	Fp_Kids kids = new Fp_Kids();
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

