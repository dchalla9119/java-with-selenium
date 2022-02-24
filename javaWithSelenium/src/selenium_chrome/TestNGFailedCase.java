package selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGFailedCase {

	WebDriver driver;
	@BeforeSuite
	public void openBrowser()//first this one going to be executed 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse december 2021\\javaWithSelenium\\drivers2\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dileep.Challa\\OneDrive\\Desktop\\eclipse february\\javaWithSelenium\\drivers2\\chromedriver.exe");	
		driver = new ChromeDriver();//this is by using WebDriver reference. this is third approach
				driver.manage().window().maximize();//browser maximises
				driver.manage().deleteAllCookies();//to delete the cookies.
				System.out.println("BS");
	}
	@Test
	public void loginTestCase()//2nd this one going to be executed
	//when error is encountered create field driver 
	{
		driver.get("https://www.gmail.com");
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("dileep.challa.3410@gmail.com");
		WebElement nxt = driver.findElement(By.id("identifierNext556"));//i wrote here 556 to fail the test case
		nxt.click();
		System.out.println("@Test: loginTestCase()");
	}
	@AfterSuite
	public void closeBrowser() //last this one going to be executed
	//when error is encountered create field driver 
	{
		driver.close();	
		System.out.println("AS");
	}


}
