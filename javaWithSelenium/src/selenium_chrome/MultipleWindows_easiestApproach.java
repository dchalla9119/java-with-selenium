package selenium_chrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows_easiestApproach {
	public static void main(String[] args) throws InterruptedException {
		
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
		driver.get("https://www.rameshsoft.com");

		driver.findElement(By.xpath("//a[text()='Videos']")).click();
		
		Thread.sleep(3000);
		
		//String currentWindow = driver.getWindowHandle();//returns current window
		Set<String> windows = driver.getWindowHandles();//returns all windows //inseption order is preserved
	//	System.out.println("1st window is:   "+currentWindow);
		
		List<String> listWindows = new ArrayList<>(windows);
		String secWindow = listWindows.get(1);
		driver.switchTo().window(secWindow);
		Thread.sleep(5000);
		
		
		
		
//		for(String str : windows)
//		{
//			if(currentWindow.equalsIgnoreCase(str))
//			{
//				System.out.println("selenium is already focussing");
//			}
//			else
//			{
//				driver.switchTo().window(str);
//				String secWindow = driver.getWindowHandle();
//				System.out.println("2nd window is :  "+secWindow);
//			}
//		}
//		
		driver.findElement(By.xpath("//div[@id='search-input']/input")).sendKeys("RAMESHSOFT");
		
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
		
	}

	
}
