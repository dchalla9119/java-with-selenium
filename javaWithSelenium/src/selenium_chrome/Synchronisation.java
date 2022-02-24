package selenium_chrome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {

	public static void main(String[] args) throws InterruptedException {
		//String userCurDir = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");	
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
			
			driver.manage().timeouts().implicitlyWait(56, TimeUnit.SECONDS);//implicit wait
			
			driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);//setscript timeout
			
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);//page load timeout
			
			//Options options = driver.manage();
			//Timeouts timeouts = options.timeouts();
			//timeouts.implicitlyWait(56, TimeUnit.SECONDS);
			//if you want timeouts object we need to call options object and then timeouts method
			//instead of writing this 3 lines we wrote in 1 line in above implicit wait
			
			driver.get("https://www.gmail.com");
			
			String title = driver.getTitle();
			System.out.println("Title is:  "+title);
			
			String currentWindowName = driver.getWindowHandle();
			System.out.println("window name is:  "+currentWindowName);
			
			String currentUrl = driver.getCurrentUrl();
			System.out.println("current url is:  "+currentUrl);
			
			//1. identify the element
			//WebElement username = driver.findElement(By.id("identifierId"));
			WebElement username = driver.findElement(By.ById.id("identifierId"));//By.ById.  By is outer class. ById is inner class.
			
			//2. perform the action
			username.clear();
			username.sendKeys("dileep.challa.3410@gmail.com");
			
						
			//Thread.sleep(4000);//sleep mechanism
			
			//1. identify the element
			WebElement next = driver.findElement(By.id("identifierNext"));
			
			WebDriverWait wait = new WebDriverWait(driver, 56);//here it is going to wait for 56 sec
			wait.until(ExpectedConditions.visibilityOf(next));
			//if the element is not visible in 56 sec we are going to get invisibility of exception.
			//mandatory the next element should display within 56 sec.

			
			//2. perform the action
			next.click();
			
			Thread.sleep(6000);//wait for 6 seconds//we added throws declaration
			driver.close();//closes the browser
			
			//System.out.println(userCurDir);
		
	}


}
