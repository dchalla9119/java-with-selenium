package oops_Concept;

class ObjectTest
{
	int practiceHrs;
	String result;
	public void hello()
	{
		System.out.println(practiceHrs+"***********"+result);
	}
}
public class InitialisationThroughObject {
public static void main(String[] args) {
	ObjectTest objectTest = new ObjectTest();
	objectTest.hello();//output: 0***********null
	objectTest.practiceHrs = 9;//initialization through object
	objectTest.result ="job";//initialization through object
	objectTest.hello();//output: 9***********job

}
}

//op
//0***********null
//9***********job
