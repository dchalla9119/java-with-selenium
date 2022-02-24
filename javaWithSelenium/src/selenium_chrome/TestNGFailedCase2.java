package selenium_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGFailedCase2 {

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
	public void again() {
		System.out.println("@Test: again");
	}
	@Test
	public void loginTestCase()//2nd this one going to be executed
	//when error is encountered create field driver 
	{
		driver.get("https://www.gmail.com");
		WebElement un = driver.findElement(By.id("identifierId"));
		un.clear();
		un.sendKeys("dileep.challa.3410@gmail.com");
		WebElement nxt = driver.findElement(By.id("identifierNext"));//i wrote here 556 to fail the test case
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
@BeforeTest
	public void beforeTest() {
		System.out.println("BT");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BC");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BM");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AT");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AC");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AM");
	}
	@Test
	public void demo() {
		System.out.println("@Test: demo()");//here we have 2 test cases 1 is loginTestCase and 2 is demo
		//then going to be executed based on alphabetical order execution process is 1 demo and 2 loginTestCase
	}

}
