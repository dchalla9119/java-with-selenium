package oops_Concept;

abstract class demo//now this class is called read only class
{
	static int id = 456;//we have to declare this as static so we can access with class name
	static public int hello()//we have to declare this as static so we can access with class name
	{
		System.out.println("plz do practice:  "+id);
		return id;
	}
}
public class AbstractDemo {
public static void main(String[] args) {
	//demo demo1 = new demo(); we will get error. in abstract we cannot create object
	//demo1.hello();
	//demo1.id = 91456;
	//demo1.hello();
	demo.hello();//output: plz do practice:  456
	
	int id = demo.hello();
	//output: 	//plz do practice:  456
				//plz do practice:  456

	System.out.println(id);
	//output:  //plz do practice:  456
				//plz do practice:  456
				//456

}
}
//we cannot create object for abstract class
