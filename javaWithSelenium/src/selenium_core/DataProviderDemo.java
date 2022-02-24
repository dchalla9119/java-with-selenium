package selenium_core;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "loginDataProvider")
	public void login(String un,String pwd) //we have 2 parameters
	//if we have 3 parameters we can supply 3values
	{
		System.out.println(un+"***********"+pwd);
	}
	
	@DataProvider
	public Object[][] loginDataProvider()
	{
		Object[][] obj = new Object[2][2];//we have to supply values from this object only otherwise we will get exception
		//if we give 3 paremeters we failed
		//The data provider is trying to pass 3 parameters but the method seleniumCore.DataProviderDemo#login takes 2
//if we give 3 times to execute the case, 3rd we will get default values going to be executed
//rameshsoft***********job
//		subject***********salary
//		null***********null
//		PASSED: login("rameshsoft", "job")
//		PASSED: login("subject", "salary")
//		PASSED: login(null, null)


		obj[0][0] = "rameshsoft";
		obj[0][1] = "job";
		obj[1][0] = "subject";
		obj[1][1] = "salary";
		return obj;
	}

}
