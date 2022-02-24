package oops_Concept;

class Fp_Men3
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
class Fp_WoMen3
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
class Fp_Kids3
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
public class InheritanceUsingExtendsKeyword {
public static void main(String[] args) {
	Fp_Men3 men = new Fp_Men3();
	men.login();
	men.logout();
	men.clothes();
	Fp_WoMen3 women = new Fp_WoMen3();
	women.login();
	women.logout();
	women.gold();
	Fp_Kids3 kids = new Fp_Kids3();
	kids.login();
	kids.logout();
	kids.toys();
}
}
