package selenium_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

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
		driver.get("https://www.rameshsoft.com");

		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		//going to get total no of elements in the form of list
		
		int enabledLinks = 0;
		int disabledLinks = 0;
		
		//from this list you have to get elements one by one and check element is of type link or not - what we do - using cursors or for each loop
		for(WebElement element : elements)//we will get elements one by one
		{
			if(element.isDisplayed()&&element.isEnabled())
			{
				String tagName = element.getTagName();
				if(tagName.equalsIgnoreCase("a"))
				{
					enabledLinks++;
				}
				else
				{
					System.out.println("it is not a link");
				}
			}
			else
				{
					disabledLinks++;
				}
			}
		System.out.println("enabled links:  " +enabledLinks);
		System.out.println("disabled links:  " +disabledLinks);
		}
		

}
