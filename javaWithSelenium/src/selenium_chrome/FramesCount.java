package selenium_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCount {

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
		
		List<WebElement> elements = driver.findElements(By.xpath("//*"));//to find totalno of elements

		int frameCount = 0;
		
		for(WebElement element : elements)
		{
			if(element.isDisplayed()&&element.isEnabled())
			{
				String tagName = element.getTagName();
				if(tagName.equalsIgnoreCase("iframe"))
				{
					frameCount++;
					String frameId = element.getAttribute("id");
					System.out.println("frame id is:  " +frameId);
					String frameClass = element.getAttribute("class");
					System.out.println("frame class is:  " +frameClass);
					String frameSrc = element.getAttribute("src");
					System.out.println("frame src is:  " +frameSrc);

				}
			}
		}
		
	}

	
}
