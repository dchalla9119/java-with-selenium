package oops_Concept;

class one
{
	public void play()
	{
		System.out.println("parent play");
	}
	public void entertainment()
	{
		System.out.println("parent we should enjoy");
	}
	public void study()
	{
		System.out.println("parent we should study");
	}
}
class two extends one//here we are using inheritance concept to child one parent class
{
	@Override
	public void study()//static public void study() we cannot override this static method
	{
		System.out.println("child we dont study");
	}
	public void practice()
	{
		System.out.println("child we dont practice");
	}
	
}
public class OverRidingDemo {
	public static void main(String[] args) {
		one one1 = new one();//parent class object using parent class reference
		one1.entertainment();
		one1.play();
		one1.study();
		two two2 = new two();//child class object using child class reference
		two2.entertainment();
		two2.play();
		two2.study();
		two2.practice();
		one one2 = new two();//creating child class object by using parent class reference. we can access only parent class methods
		one2.entertainment();
		one2.play();
		one2.study();
		//one2.practice();//creating child class object by using parent class reference. we can access only parent class methods

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
//child we dont study
//
