package selenium_chrome;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdpCount {

	public static void main(String[] args) {
		
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
		driver.get("https://www.adp.com");

		List<WebElement> elements= driver.findElements(By.cssSelector("*"));//to find total no of elements
		
		Iterator<WebElement> iterator = elements.iterator();//to get the elements one by one we can use cursors or for each loop. here we are using iterator
		//here elements is collection object. we are using iterator to retrive the elements
		//cursors we have 3 methods: 1.enumeration  2.list iterator  3.iterator
		
		int adpCount = 0;
		
		while(iterator.hasNext())
		{
			WebElement element = iterator.next();//getting element one by one
			if(element.isDisplayed()&&element.isEnabled())//to check element is displayed and enabled
			{
				String txt = element.getText();//to get the element text.
				//if the elements is not having any text we will get null values
				if(txt!=null)//we have to check for null condition. if u dont check for null condition and call something we will get null pointer exception
				{
					if (txt.contains("adp")||txt.contains("ADP"))
					{
						adpCount++;
						System.out.println(txt);
					}
				}
			}
			
		}
		
		System.out.println("adp count is:   "  +adpCount);
		
	}

}
