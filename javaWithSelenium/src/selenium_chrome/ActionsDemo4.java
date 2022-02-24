package selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo4 {
	public static void main(String[] args) {
		//String userCurDir = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		//we are setting the path			
		//to open chrome browser
			//ChromeDriver driver = new ChromeDriver();//this ChromeDriver is coming from package org.openqa.selenium.chrome.ChromeDriver
			//this is with chrome driver reference. this is first approach.
			//RemoteWebDriver driver = new ChromeDriver();//this is by using RemoteWebDriver. this is second approach
		WebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
			//we can access only WebDriver specific methods
			//SearchContext driver = new ChromeDriver();//this is not advised to use
			//driver.
		driver.manage().window().maximize();//browser maximises
		driver.manage().deleteAllCookies();//to delete the cookies.
		driver.get("https://www.gmail.com");
		
//		//ways to enter url
//		//driver.get("https://www.gmail.com");//by using get method we can enter the url  1.method
//		//driver.navigate().to("https://www.gmail.com");//by using navigate().to() method   2.method
		
//		//URL url = new URL("https://www.gmail.com");//by using url method    3.method
//		//driver.navigate().to(url);
	//	
//		//using javascriptExecutor     4.method
		
		
		
		
		//ways to perform data typing action

		//WebElement userName = driver.findElement(By.id("identifierId"));
		
		//1 method
//		userName.clear();
//		userName.sendKeys("rameshsoft.9177791456@gmail.com");
		
		//2 method
		//Actions actions = new Actions(driver);
		//actions.sendKeys(userName, "rameshsoft.9177791456@gmail.com").build().perform();
		//when we are using Actions compulsory we should add build().perform(); actions otherwise action not going to be performed. build optional
		//actions.sendKeys(userName, "dileep.challa.3410@gmail.com").perform();
		//build() is optional. if u dont call it there is no problem. we will get desired output
		//actions.sendKeys(userName, "dileep.challa.3410@gmail.com");
		// if we dont use build().perform() methods it wont perform the actions. 
		//compulsory we should use build().perform()  or  perform() method
		
		//3 method
		//actions.click(userName).sendKeys("dileep.challa.3410@gmail.com").build().perform();
		//all actions are made as single action and we are performing perform action
//		Actions actions2 = actions.click(userName);
//		Actions actions3 = actions2.sendKeys("dileep.challa.3410@gmail.com");
//		Action action = actions3.build();
//		action.perform();
	////insted of writing this 4 lines we are writing single line actions.click(userName).sendKeys("dileep.challa.3410@gmail.com").build().perform();
	////by the calling build() method all the actions are going to be made single action.


		//4 method
	////using javascriptExecutor
		
		
	//ways to perform Clickable Action
		
//		WebElement element = driver.findElement(By.id("identifierNext"));
//		element.click();//WebElement interface click method
//		
//		Actions actions = new Actions(driver);
//		//actions.click(element).build().perform();
		//actions.doubleClick(element).build().perform();
		//actions.sendKeys(element, Keys.ENTER).build().perform();//keys is a enums class

		//using javascriptExecutor
	//	
	//	
//		actions.sendKeys(Keys.END).build().perform();//it will come down completely
//		actions.sendKeys(Keys.HOME).build().perform();//it will move to the top completely
//		actions.sendKeys(Keys.ARROW_UP).build().perform();
//		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
//		actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
//		actions.sendKeys(Keys.ARROW_LEFT).build().perform();
	//	
		//to perform control+ control shift + methods we have methord Chord
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).build().perform();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
	//	
//		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"t")).build().perform();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
	//	
	//	
//		driver.get("https://www.flipkart.com");
//		WebElement electronics = driver.findElement(By.xpath("//div[@class='xtXmba'][text()='Electronics']"));
//		actions.moveToElement(electronics).build().perform();
	//	
	}


}
