package selenium_core;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo {

	@Test
	public void jobIsMandatory() {
		System.out.println("Job is Mandatory");//here the test case is passed
	}
	
@Parameters({"id"})
@Test
public void jobIsMandatoryFor(@Optional("10")String id)//this test method requires 1 parameter called id. i need to supply from xml file
//if u dony supply any value through xml default value going to be executed
{
	System.out.println("Job is Mandatory for U:   " +id);//here weget exception
	//Method jobIsMandatoryFor requires 1 parameters but 0 were supplied in the @Test annotation.

}

@Parameters({"id","job"})
@Test
public void jobIsMandatoryFor(@Optional("10")String id,@Optional("SOFTWARE")String job)//here we are taking multiple methods
{
	System.out.println("Job is Mandatory for U:   " +id);//here weget exception
	//Method jobIsMandatoryFor requires 1 parameters but 0 were supplied in the @Test annotation.

}


}
