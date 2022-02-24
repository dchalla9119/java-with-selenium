package selenium_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo3_SC {
	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.jqueryui.com");
		
//		driver.findElement(By.linkText("Autocomplete")).click();
//		Thread.sleep(3000);
//		
//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));//to get iframe elements
//		System.out.println("no of frames are:  "+elements.size());//we are getting total no of frames
//		
//		//driver.switchTo().frame(0);//we are switching to frame //we can tell in this way
//		
//		//we can write in this way also
//		TargetLocator targetLocator = driver.switchTo();	
//		//targetLocator.frame(0);//we can tell in this way also. TargetLocator is important many people dont know this.1
//		//targetLocator.frame("");//switch to frame by id or name.2
//		WebElement element = driver.findElement(By.className("demo-frame"));//we are identifying element with clasds name.3
//		targetLocator.frame(element);
////		
//		
//		WebElement tags = driver.findElement(By.id("tags"));//this element is there as a part of frame
//		tags.sendKeys("PRACTICE");
//		
//		targetLocator.defaultContent();//come out from frame to main window
//		driver.findElement(By.linkText("Draggable")).click();
//		
//		targetLocator.frame(0);
//		
//		WebElement draggable1 = driver.findElement(By.id("draggable"));
//		Actions actions = new Actions(driver);
//		actions.dragAndDropBy(draggable1, 150,150).build().perform();
//		
//		targetLocator.defaultContent();
//		
//		driver.findElement(By.linkText("Droppable")).click();
//		
//		targetLocator.frame(0);
//		
//		WebElement draggable2 = driver.findElement(By.id("draggable"));
//		WebElement droppable2 = driver.findElement(By.id("droppable"));
//		
//		actions.dragAndDrop(draggable2, droppable2).build().perform();
//		
//		targetLocator.defaultContent();
//		
//		driver.close();
//		
		

		
		
		
		
		
		
		
		
//		driver.manage().window().maximize();//browser maximises
//		driver.manage().deleteAllCookies();//to delete the cookies.
//		driver.get("https://www.gmail.com");
//		
//		WebElement element = driver.findElement(By.name("q"));
//		element.sendKeys("rameshsoft");
//		
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.ENTER).build().perform();
//		
//		WebElement rameshsoft = driver.findElement(By.xpath("//h3[contains(text(),'RAMESHSOFT - India')]"));
//		actions.contextClick(rameshsoft).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();//right click operation key word is contextClick
//		//above line we can write in multiple lines as follows
		
//		Actions actions2 = actions.contextClick(rameshsoft);
//		Actions actions3 = actions2.sendKeys(Keys.ARROW_DOWN);
//		Actions actions4 = actions3.sendKeys(Keys.RETURN);
//		Action action = actions4.build();
//		action.perform();
		//instead of writing this many steps we are writing in single step as shown above
		
		
		
		
		
//		
////		//ways to enter url
////		//driver.get("https://www.gmail.com");//by using get method we can enter the url  1.method
////		//driver.navigate().to("https://www.gmail.com");//by using navigate().to() method   2.method
//		
////		//URL url = new URL("https://www.gmail.com");//by using url method    3.method
////		//driver.navigate().to(url);
//	//	
////		//using javascriptExecutor     4.method
//		
//		
//		
//		
//		//ways to perform data typing action
//
//		WebElement userName = driver.findElement(By.id("identifierId"));
//		
//		//1 method
////		userName.clear();
////		userName.sendKeys("rameshsoft.9177791456@gmail.com");
//		
//		//2 method
//		//Actions actions = new Actions(driver);
//		//actions.sendKeys(userName, "rameshsoft.9177791456@gmail.com").build().perform();
//		//when we are using Actions compulsory we should add build().perform(); actions otherwise action not going to be performed. build optional
//		//actions.sendKeys(userName, "dileep.challa.3410@gmail.com").perform();
//		//build() is optional. if u dont call it there is no problem. we will get desired output
//		//actions.sendKeys(userName, "dileep.challa.3410@gmail.com");
//		// if we dont use build().perform() methods it wont perform the actions. 
//		//compulsory we should use build().perform()  or  perform() method
//		
//		//3 method
//		//actions.click(userName).sendKeys("dileep.challa.3410@gmail.com").build().perform();
//		//all actions are made as single action and we are performing perform action
////		Actions actions2 = actions.click(userName);
////		Actions actions3 = actions2.sendKeys("dileep.challa.3410@gmail.com");
////		Action action = actions3.build();
////		action.perform();
//	////insted of writing this 4 lines we are writing single line actions.click(userName).sendKeys("dileep.challa.3410@gmail.com").build().perform();
//	////by the calling build() method all the actions are going to be made single action.
//
//
//		//4 method
//	////using javascriptExecutor
//		
//		
//	//ways to perform Clickable Action
//		
//		WebElement element = driver.findElement(By.id("identifierNext"));
//		element.click();//WebElement interface click method
//		
//		Actions actions = new Actions(driver);
//		//actions.click(element).build().perform();
//		//actions.doubleClick(element).build().perform();
//		//actions.sendKeys(element, Keys.ENTER).build().perform();//keys is a enums class
//
//		//using javascriptExecutor
//	//	
//	//	
////		actions.sendKeys(Keys.END).build().perform();//it will come down completely
////		actions.sendKeys(Keys.HOME).build().perform();//it will move to the top completely
////		actions.sendKeys(Keys.ARROW_UP).build().perform();
////		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
////		actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
////		actions.sendKeys(Keys.ARROW_LEFT).build().perform();
//	//	
//		//to perform control+ control shift + methods we have methord Chord
////		actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).build().perform();
////		actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
//	//	
////		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"t")).build().perform();
////		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"s")).build().perform();
//	//	
//	//	
////		driver.get("https://www.flipkart.com");
////		WebElement electronics = driver.findElement(By.xpath("//div[@class='xtXmba'][text()='Electronics']"));
////		actions.moveToElement(electronics).build().perform();
//	//	
	}



}
