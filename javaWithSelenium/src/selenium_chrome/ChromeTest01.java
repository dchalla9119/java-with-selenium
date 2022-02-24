package selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest01 {
	public static void main(String[] args) throws InterruptedException {
		
		String userCurDir = System.getProperty("user.dir");
		System.out.println(userCurDir);//we will get project path dynamically
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		//we are setting the path
		
		
		//to open chrome browser
	//ChromeDriver driver = new ChromeDriver();//this ChromeDriver is coming from package org.openqa.selenium.chrome.ChromeDriver
//		//this is with chrome driver reference. this is first approach.
	//RemoteWebDriver driver = new ChromeDriver();//this is by using RemoteWebDriver. this is second approach. this method id is advisable
		WebDriver driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
//		//we can access only WebDriver specific methods
	//SearchContext driver = new ChromeDriver();//this is not advised to use


		
		driver.manage().window().maximize();//browser maximises
		driver.manage().deleteAllCookies();//to delete the cookies. if we open url sometimes it is not opening, we have to delete cookie
		driver.get("https://www.gmail.com");//to enter the url
		
		String title = driver.getTitle();//to get the title of the page in the form of string
		System.out.println("Title is:  "+title);
		
		String currentWindowName = driver.getWindowHandle();//to return current window name in the form of string
		System.out.println("window name is:  "+currentWindowName);
		
		String currentUrl = driver.getCurrentUrl();//to return url of the current page
		System.out.println("current url is:  "+currentUrl);
		
		//1. identify the element
		WebElement username = driver.findElement(By.id("identifierId"));
		
		
		//2. perform the action
		username.clear();//to clear the particular text field
		username.sendKeys("dileep.challa.3410@gmail.com");//we can pass the text data to the webelements.
		
		//1. identify the element
		WebElement next=driver.findElement(By.className("VfPpkd-vQzf8d"));
		
		Thread.sleep(4000);//to stop execution after certainperiod of time
		
		//2. perform the action
		next.click();
		
		Thread.sleep(4000);//to stop execution after certainperiod of time
		driver.close();//current window will be closed
//		Thread.sleep(6000);//wait for 6 seconds//we added throws declaration
//		driver.close();//closes the browser

	}

}
