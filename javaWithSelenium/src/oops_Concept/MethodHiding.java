package oops_Concept;

class one1
{
	public void play()
	{
		System.out.println("parent play");
	}
	public void entertainment()
	{
		System.out.println("parent we should enjoy");
	}
	static public void study()
	{
		System.out.println("parent we should study");
	}
}
class two2 extends one1//here we are using inheritance concept
{
	//@Override we get compile time error. this is method hiding not overriding.
		static public void study()//here this is method hiding. we are avoiding overriding. we are using static keyword in parent and child class
		//to implement method hiding both methods should be static.
		//we can increase the visibility of the method. private -> default -> protected -> public. this is the order
		//static private void study() - parent
		//static public void study() - child
		//we are increasing the visibility from private in parent class to public in child class
	{
		System.out.println("child we dont study");
	}
	public void practice()
	{
		System.out.println("child we dont practice");
	}
	
}
public class MethodHiding {
	public static void main(String[] args) {
		one1 one111 = new one1();//parent class object using parent class reference
		one111.entertainment();
		one111.play();
		one111.study();
		two2 two222 = new two2();//child class object using child class reference
		two222.entertainment();
		two222.play();
		two222.study();
		two222.practice();
		one1 min = new two2();//creating child class object by using parent class reference. we can access only parent class methods
		min.entertainment();
		min.play();
		min.study();
		
	}
}
//op
//parent we should enjoy
//parent play
//parent we should study
//parent we should enjoy
//parent play
//child we dont study
//child we dont practice
//parent we should enjoy
//parent play
//parent we should study
