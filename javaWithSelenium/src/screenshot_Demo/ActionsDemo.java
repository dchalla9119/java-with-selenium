package screenshot_Demo;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
		//above is first approach
		//WebDriver driver = new ChromeDriver();
		//above is 2nd approach
		//we will get error because in webdriver interface there is no take screenshot method. we need to type cast take scrrenshot object
		driver.manage().window().maximize();//browser maximises
		driver.manage().deleteAllCookies();//to delete the cookies.
		driver.get("https://www.cleartrip.com");
		
		//TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		//whenever we are using remotewebdriver we need to do nothing. when we use webdriver as reference we need to type cast takescreenshot.
		File file = driver.getScreenshotAs(OutputType.FILE);//ist approach
		//File file = takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\screenshot\\cleartrips.jpeg"));
		
		
		
		
		
//		driver.findElement(By.linkText("Autocomplete")).click();
//		Thread.sleep(3000);
	//	
//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));//to get iframe elements
//		System.out.println("no of frames are:  "+elements.size());//we are getting total no of frames
	//	
//		//driver.switchTo().frame(0);//we are switching to frame //we can tell in this way
//		TargetLocator targetLocator = driver.switchTo();	
//		//targetLocator.frame(0);//we can tell in this way also. TargetLocator is important many people dont know this.
//		//targetLocator.frame("");//switch to frame by id or name
//		WebElement element = driver.findElement(By.className("demo-frame"));
//		targetLocator.frame(element);
	//	
//		WebElement tags = driver.findElement(By.id("tags"));//this element is there as a part of frame
//		tags.sendKeys("PRACTICE");
	//	
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
		
		
		
		
		
//		{	
//		//ways to enter url
//		//driver.get("https://www.gmail.com");//by using get method we can enter the url  1.method
//		//driver.navigate().to("https://www.gmail.com");//by using navigate().to() method   2.method
	//	
//		//URL url = new URL("https://www.gmail.com");//by using url method    3.method
//		//driver.navigate().to(url);
	//	
//		//using javascriptExecutor     4.method
	//}
	//	
	//	
//		{
//		//ways to perform data typing action
//			
//			WebElement userName = driver.findElement(By.id("identifierId"));
////			userName.clear();
////			userName.sendKeys("dileep.challa.3410@gmail.com");
//			
//			Actions actions = new Actions(driver);
//			actions.sendKeys(userName, "dileep.challa.3410@gmail.com").build().perform();//when we are using Actions compulsory we should add build().perform(); actions otherwise action not going to be performed
//			//actions.sendKeys(userName, "dileep.challa.3410@gmail.com").perform();//build() is optional. if u dont call it there is no problem. we will get desired output
//			//actions.sendKeys(userName, "dileep.challa.3410@gmail.com");// if we dont use build().perform() methods it wont perform the actions. 
//			//compulsory we should use build().perform()  or  perform() method
//			
//			//actions.click(userName).sendKeys("dileep.challa.3410@gmail.com").build().perform();
////			Actions actions2 = actions.click(userName);
////			Actions actions3 = actions2.sendKeys("dileep.challa.3410@gmail.com");
////			Action action = actions3.build();
////			action.perform();
//			//insted of writing this 4 lines we are writing single line actions.click(userName).sendKeys("dileep.challa.3410@gmail.com").build().perform();
//			//by the calling build() method all the actions are going to be made single action.
//			
//			
//			//using javascriptExecutor
//		}
//			
			
		
		//ways to perform Clickable Action
		
//		WebElement element = driver.findElement(By.id("identifierNext"));
//		element.click();//WebElement interface click method
	//	
//		Actions actions = new Actions(driver);
//		//actions.click(element).build().perform();
//		//actions.doubleClick(element).build().perform();
//		//actions.sendKeys(element, Keys.ENTER).build().perform();//keys is a enums class
//		//using javascriptExecutor
	//	
	//	
//		actions.sendKeys(Keys.END).build().perform();//it will come down completely
//		actions.sendKeys(Keys.HOME).build().perform();//it will move to the top completely
//		actions.sendKeys(Keys.ARROW_UP).build().perform();
//		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
//		actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
//		actions.sendKeys(Keys.ARROW_LEFT).build().perform();
	//	
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"t")).build().perform();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,"s")).build().perform();
	//	
//		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"t")).build().perform();
//		actions.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,"t")).build().perform();
	//	
	//	
//		driver.get("https://www.flipkart.com");
//		WebElement electronics = driver.findElement(By.xpath("//div[@class='xtXmba'][text()='Electronics']"));
//		actions.moveToElement(electronics).build().perform();
	//	
	}

	}
