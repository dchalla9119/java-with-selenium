package locatorMechanisms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Locator_Mechanisms03 {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");
		//we are setting the path
		
		RemoteWebDriver driver = new ChromeDriver();//this is by using RemoteWebDriver. this is second approach. this method id is advisable
		
		driver.manage().window().maximize();//browser maximises
		driver.manage().deleteAllCookies();//to delete the cookies. if we open url sometimes it is not opening, we have to delete cookie
		driver.get("https://www.flipkart.com/");//to enter the url
		
		//by using partialLinkText
		driver.findElement(By.partialLinkText("Login"));
		
		//by using xpath
		//driver.findElement(By.xpath("//div[@id='container']/div/div/div/div[2]/div/div/div/div/a"));
		//driver.findElement(By.xpath("//div[@class=\"_1psGvi _3BvnxG\"]/div/a"));
		
		//by using css selector
		//driver.findElement(By.cssSelector("a[class='_1_3w1N']"));
		
		
		Thread.sleep(4000);//to stop execution after certainperiod of time
		driver.close();//current window will be closed
	}
}
